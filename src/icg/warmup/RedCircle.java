package icg.warmup;

import icg.warmup.base.ImageGenerator;
import icg.warmup.base.Painter;
import ogl.vecmath.Color;

import static icg.math.FactoryImpl.vecmath;

/**
 * Created by eric on 4/19/16.
 */
public class RedCircle implements Painter {
    public static void main(String[] args) {
        new ImageGenerator(new RedCircle(), 100, 100, "red_circle.png");
    }
    @Override
    public Color pixelColorAt(int x, int y, int width, int height) {
        int shortest_edge = width < height ? width : height;
        double radius = shortest_edge * 0.45;
        double xmiddle = width / 2;
        double ymiddle = height / 2;
        double distance = Math.sqrt((xmiddle-x)*(xmiddle-x)+(ymiddle-y)*(ymiddle-y));
        return distance  <= radius ? vecmath.color(1, 0, 0) : vecmath.color(0.5f, 0.5f, 0.5f);
    }
}
