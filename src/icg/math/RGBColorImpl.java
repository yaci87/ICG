package icg.math;

import java.nio.FloatBuffer;

/**
 * Created by eric on 4/19/16.
 */
public class RGBColorImpl implements ogl.vecmath.Color {
    private float r;
    private float g;
    private float b;

    public RGBColorImpl(float r, float g, float b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public float getR() {
        return r;
    }

    @Override
    public float getG() {
        return g;
    }

    @Override
    public float getB() {
        return b;
    }

    @Override
    public boolean isBlack() {
        return false;
    }

    @Override
    public ogl.vecmath.Color add(ogl.vecmath.Color c) {
        return null;
    }

    @Override
    public ogl.vecmath.Color modulate(float s) {
        return null;
    }

    @Override
    public ogl.vecmath.Color modulate(ogl.vecmath.Color c) {
        return null;
    }

    @Override
    public ogl.vecmath.Color clip() {
        return null;
    }

    @Override
    public float[] asArray() {
        return new float[0];
    }

    @Override
    public FloatBuffer asBuffer() {
        return null;
    }

    @Override
    public void fillBuffer(FloatBuffer buf) {

    }

    @Override
    public int toAwtColor() {
        return new java.awt.Color(r, g, b).getRGB();
    }

    @Override
    public int compareTo(ogl.vecmath.Color o) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString(){
        return "RGB("+r+", "+g+", "+b+")";
    }
}
