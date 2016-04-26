package icg.rendering;

import java.util.ArrayList;

import icg.math.RGBColorImpl;
import icg.math.VectorImpl;
import ogl.vecmath.*;

public class LineImpl extends Line {
    private Color color;
	/**
	 * constructor, sets vertices of this line
	 * default color black
	 * @param p1 the first vertex
	 * @param p2 the second vertex
	 */
	public LineImpl(Vector p1, Vector p2) {
        this(p1, p2, new RGBColorImpl(0, 0, 0));
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
        return new RGBColorImpl(1, 1, 1);
	}

	/*
	 * (non-Javadoc)
	 * @see icg.rendering.Line#getPixels(int, int)
	 */
	@Override
	public ArrayList<Pixel> getPixels(int width, int height){
        //Bresenham Algorithmus, siehe Wikipedia
        return null;
	}
}
