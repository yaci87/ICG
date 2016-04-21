package icg.math;

import ogl.vecmath.Color;

import java.nio.FloatBuffer;

/**
 * Created by eric on 4/19/16.
 */
public class YUVColorImpl implements Color {
    private float y;
    private float u;
    private float v;

    public float getV() {
        return v;
    }

    public float getU() {
        return u;
    }

    public float getY() {
        return y;
    }



    public YUVColorImpl(float y, float u, float v) {
        this.y = y;
        this.u = u;
        this.v = v;
    }

    public YUVColorImpl(RGBColorImpl rgb){
        this.y = 0.299f * rgb.getR() + 0.587f * rgb.getG() + 0.144f * rgb.getR();
        this.u = (rgb.getB()-y)*0.493f;
        this.v = (rgb.getR()-y)*0.877f;
    }

    @Override
    public float getR() {
        return 0;
    }

    @Override
    public float getG() {
        return 0;
    }

    @Override
    public float getB() {
        return 0;
    }

    @Override
    public boolean isBlack() {
        return false;
    }

    @Override
    public Color add(Color c) {
        return null;
    }

    @Override
    public Color modulate(float s) {
        return null;
    }

    @Override
    public Color modulate(Color c) {
        return null;
    }

    @Override
    public Color clip() {
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
        return 0;
    }

    @Override
    public int compareTo(Color o) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }
}
