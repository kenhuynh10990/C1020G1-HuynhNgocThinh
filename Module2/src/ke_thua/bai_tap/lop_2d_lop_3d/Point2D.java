package ke_thua.bai_tap.lop_2d_lop_3d;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        this(2.0f,3.0f);
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        float[] array = {this.x, this.y};

        return array;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "2D: "+ "x: "+ getX()+ ",y: "+getY();
    }
}
