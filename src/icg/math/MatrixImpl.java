package icg.math;

import ogl.vecmath.Matrix;
import ogl.vecmath.Vector;

import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by david on 03.05.16.
 */
public class MatrixImpl implements Matrix{
    float[] values;
    public MatrixImpl(float[] values){
        this.values = new float[16];
        setValues(values);
    }

    @Override
    public float[] getValues() {;
        return values;
    }

    @Override
    public void setValues(float[] vals) {
        values = vals;
    }

    @Override
    public float get(int c, int r) {
        return values[r*4 + c];
    }

    @Override
    public Matrix mult(Matrix m) {
        float[] newvals = new float[16];
        for(int i=0; i< 4;i++){     //Zeilen von new
            for (int j=0; j<4;j++){ //spalte von new
                for(int k=0; k<4; k++){
                    newvals[i*4+j] = newvals[i*4+j] + values[i*4+k] * m.getValues()[k*4+j];
                }
            }
        }
        return new MatrixImpl(newvals);
    }

    @Override
    public Matrix multSlow(Matrix m) {
        return this.mult(m);
    }

    private Vector multVec(float[] vec){
        float vals[] = new float[4];
        for(int row=0;row<4;row++){
            for(int column=0;column<4;column++){
                vals[row] += values[row*4+column]*vec[column];
            }
        }
        return new VectorImpl(vals[0], vals[1], vals[2]);
    }

    @Override
    public Vector transformPoint(Vector v) {
        return multVec(new float[]{v.x(), v.y(), v.z(), 1});
    }

    @Override
    public Vector transformDirection(Vector v) {
        return multVec(new float[]{v.x(), v.y(), v.z(), 0});
    }

    @Override
    public Vector transformNormal(Vector v) {
        return null;
    }

    @Override
    public Matrix transpose() {
        float[] transposed = new float[16];
        for(int i = 0; i<16; i++){
            transposed[(i%4)*4+(i/4)%4] = values[i];
        }
        return new MatrixImpl(transposed);
    }
    @Override
    public Matrix invertRigid() {
        return null;
    }

    @Override
    public Matrix invertFull() {
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
    public Matrix getRotation() {
        return null;
    }

    @Override
    public Matrix getTranslation() {
        return null;
    }

    @Override
    public Vector getPosition() {
        return null;
    }

    @Override
    public boolean equals(Matrix m, float epsilon) {
        return false;
    }
}
