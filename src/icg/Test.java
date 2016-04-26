package icg;

import icg.math.VectorImpl;
import icg.rendering.LineImpl;
import icg.warmup.base.ImageGenerator;

/**
 * Created by david on 26.04.16.
 */
public class Test {
    public static void main(String[] args) {
        int pictureWidth = 600;
        int pictureHeigt = 600;
        new ImageGenerator(new LineImpl(new VectorImpl(0,0,0),new VectorImpl(pictureWidth, pictureHeigt, 0)), pictureWidth, pictureHeigt, "line.png");
    }
}
