package icg;

import icg.math.MatrixImpl;
import icg.math.VectorImpl;
import icg.rendering.LineImpl;
import icg.warmup.base.ImageGenerator;
import ogl.vecmath.Matrix;
import ogl.vecmath.Vector;

import java.util.Arrays;

/**
 * Created by david on 26.04.16.
 */
public class Test {
    public static void main(String[] args) {
        int pictureWidth = 600;
        int pictureHeigt = 600;
        Vector p1 = new VectorImpl(0,0,0);
        Vector p2 = new VectorImpl(1,1,0);
        Matrix mat = new MatrixImpl(new float[]{1,0,0,10,0,1,0,0,0,0,1,0,0,0,0,1});
        System.out.print(mat.transformPoint(p1));
        System.out.print(mat.transformPoint(p2));
        new ImageGenerator(new LineImpl(p1,p2), pictureWidth, pictureHeigt, "line.png");
        new ImageGenerator(new LineImpl(mat.transformPoint(p1),mat.transformPoint(p2)), pictureWidth, pictureHeigt, "line_transformed.png");
    }
}
