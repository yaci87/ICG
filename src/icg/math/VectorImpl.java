package icg.math;

import ogl.vecmath.Vector;

import java.nio.FloatBuffer;

import static ogl.vecmathimp.FactoryDefault.vecmath;


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
        return new VectorImpl(v.x() + x, v.y() + y, v.z() + z);
    }

    @Override
    public Vector sub(Vector v) {
        return add(new VectorImpl(-v.x(), -v.y(), -v.z()));
    }

    @Override
    public Vector mult(float s) {
        return new VectorImpl(s * x, s * y, s * z);
    }

    @Override
    public Vector mult(Vector v) {
        return new VectorImpl(x*v.x(), y*v.y(), z*v.z());
    }

    @Override
    public float length() {
        return (float)Math.sqrt(x*x+y*y+z*z);
    }

    @Override
    public Vector normalize() {
        return this.mult(1/length());
    }

    @Override
    public float dot(Vector v) {
        return x*v.x()+y*v.y()+z*v.z();
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
        //TODO
        return null;
    }

    @Override
    public void fillBuffer(FloatBuffer buf) {
        //TODO
    }

    @Override
    public int compareTo(Vector o) {
        return ((Float)this.length()).compareTo(o.length());
    }

    @Override
    public int size() {
        return 3;
    }

    @Override
    public String toString(){
        return "["+x+","+y+","+z+"]";
    }
}
