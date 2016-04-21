package icg.math;

import ogl.vecmath.*;
import ogl.vecmath.Color;

/**
 * Created by eric on 4/19/16.
 */
public class FactoryImpl implements Factory{

public static final Factory vecmath = new FactoryImpl();

    @Override
    public Vector vector(float nx, float ny, float nz) {
        return null;
    }

    @Override
    public Vector xAxis() {
        return null;
    }

    @Override
    public Vector yAxis() {
        return null;
    }

    @Override
    public Vector zAxis() {
        return null;
    }

    @Override
    public int vectorSize() {
        return 0;
    }

    @Override
    public Matrix identityMatrix() {
        return null;
    }

    @Override
    public Matrix matrix(float m00, float m01, float m02, float m03, float m10, float m11, float m12, float m13, float m20, float m21, float m22, float m23, float m30, float m31, float m32, float m33) {
        return null;
    }

    @Override
    public Matrix matrix(float[] elements) {
        return null;
    }

    @Override
    public Matrix matrix(Vector b0, Vector b1, Vector b2) {
        return null;
    }

    @Override
    public Matrix translationMatrix(Vector t) {
        return null;
    }

    @Override
    public Matrix translationMatrix(float x, float y, float z) {
        return null;
    }

    @Override
    public Matrix rotationMatrix(Vector axis, float angle) {
        return null;
    }

    @Override
    public Matrix rotationMatrix(float ax, float ay, float az, float angle) {
        return null;
    }

    @Override
    public Matrix scaleMatrix(Vector s) {
        return null;
    }

    @Override
    public Matrix scaleMatrix(float x, float y, float z) {
        return null;
    }

    @Override
    public Matrix lookatMatrix(Vector eye, Vector center, Vector up) {
        return null;
    }

    @Override
    public Matrix frustumMatrix(float left, float right, float bottom, float top, float zNear, float zFar) {
        return null;
    }

    @Override
    public Matrix perspectiveMatrix(float fovy, float aspect, float zNear, float zFar) {
        return null;
    }

    @Override
    public Color color(float r, float g, float b) {
        return new RGBColorImpl(r, g, b);
    }

    @Override
    public int colorSize() {
        return 0;
    }
}
