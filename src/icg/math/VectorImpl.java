package icg.math;

import ogl.vecmath.Vector;

import java.nio.FloatBuffer;

/**
 * Created by david on 26.04.16.
 */
public class VectorImpl implements Vector{
    private float x;
    private float y;
    private float z;

    public VectorImpl(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public float x() {
        return x;
    }

    @Override
    public float y() {
        return y;
    }

    @Override
    public float z() {
        return z;
    }

    @Override
    public Vector add(Vector v) {
        return ogl.vecmathimp.FactoryDefault.vecmath.vector(v.x() + x(), v.y() + y(), v.z() + z());
    }

    @Override
    public Vector sub(Vector v) {
        return add(new VectorImpl(-v.x(), -v.y(), -v.z()));
    }

    @Override
    public Vector mult(float s) {
        return null;
    }

    @Override
    public Vector mult(Vector v) {
        return null;
    }

    @Override
    public float length() {
        return (float)Math.sqrt(x*x+y*y+z*z);
    }

    @Override
    public Vector normalize() {
        return null;
    }

    @Override
    public float dot(Vector v) {
        return 0;
    }

    @Override
    public Vector cross(Vector v) {
        return new VectorImpl(y*v.z()-z*v.y(), z*v.x()-x*v.z(), x*v.y()-y*v.x());
    }

    @Override
    public float[] asArray() {
        return new float[]{x, y, z};
    }

    @Override
    public FloatBuffer asBuffer() {
        return null;
    }

    @Override
    public void fillBuffer(FloatBuffer buf) {

    }

    @Override
    public int compareTo(Vector o) {
        return 0;
    }

    @Override
    public int size() {
        return 3;
    }
}
