package ke_thua.bai_tap.lop_point_moveable_point;

import ke_thua.bai_tap.lop_2d_lop_3d.Point2D;

public class MoveablePoint extends Point2D {
    private float xSpeed;
    private float ySpeed;

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint() {
        this(0.0f,0.0f);
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] array = {this.xSpeed, this.ySpeed};
        return array;
    }
    public String move(){
        setX(getX()+this.xSpeed) ;
        setY(getY()+this.ySpeed);
        return "x:"+ getX()+",y: " + getY();
    }

    @Override
    public String toString(){
        return "Moveable +\t"+ "x: "+getX()+",y:" + getY()+" speed =("+getXSpeed()+","+getYSpeed()+")";
    }
}
