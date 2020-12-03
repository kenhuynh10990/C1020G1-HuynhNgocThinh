package ke_thua.bai_tap.lop_2d_lop_3d;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        this(0.0f);
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{this.getX(), this.getY(), this.z};
    }

    public void setXYZ(float x,float y, float z){
        setX(x);
        setY(y);
        this.z=z;

    }

    @Override
    public String toString() {
        return "3D:" +"x: " +getX()+" ,y:"+ getY()+" ,z: "+getZ();
    }


}
