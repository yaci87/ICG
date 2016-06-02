package icg.rendering;

import java.util.ArrayList;

import icg.math.RGBColorImpl;
import icg.math.VectorImpl;
import ogl.vecmath.*;

public class LineImpl extends Line {
    private Color color;
	/**
	 * constructor, sets vertices of this line
	 * default color white
	 * @param p1 the first vertex
	 * @param p2 the second vertex
	 */
	public LineImpl(Vector p1, Vector p2) {
        this(p1, p2, new RGBColorImpl(1, 1, 1));
	}

    public LineImpl(Vector p1, Vector p2, Color color){
        super(p1, p2);
        this.color = new RGBColorImpl(color.getR(), color.getG(), color.getB());
    }

	/**
	 * @param fx the x coordinate of the pixel
	 * @param fy the y coordinate of the pixel
	 * @param width the width of the image
	 * @param height the height of the image
	 * @return a color if the pixel is on the line, null otherwise
	 */
	public Color pixelColorAt(int fx, int fy, int width, int height) {
        Vector p = new VectorImpl(fx, fy, 0);
        Vector diff = p.sub(p1);
        Vector lineDirection = p2.sub(p1);
        Vector normal = diff.cross(lineDirection);
        float distance = normal.length() / lineDirection.length();
        if(distance < 0.5){
            return color;
        }
        return new RGBColorImpl(0, 0, 0);
	}

	/*
	 * (non-Javadoc)
	 * @see icg.rendering.Line#getPixels(int, int)
	 */
	@Override
	public ArrayList<Pixel> getPixels(int width, int height){
        ArrayList<Pixel> pixels = new ArrayList<>();
        int x0 = (int)p1.x();
        int x1 = (int)p2.x();
        int y0 = (int)p1.y();
        int y1 = (int)p2.y();
        int dx = Math.abs(x1 - x0);
        int dy = Math.abs(y1 - y0);

        int sx = x0 < x1 ? 1 : -1;
        int sy = y0 < y1 ? 1 : -1;

        int err = dx-dy;
        int e2;
        int currentX = x0;
        int currentY = y0;

        while(true) {
            pixels.add(new Pixel(currentX, currentY, color));

            if(currentX == x1 && currentY == y1) {
                break;
            }

            e2 = 2*err;
            if(e2 > -1 * dy) {
                err = err - dy;
                currentX = currentX + sx;
            }

            if(e2 < dx) {
                err = err + dx;
                currentY = currentY + sy;
            }
        }
        return pixels;
    }
}
