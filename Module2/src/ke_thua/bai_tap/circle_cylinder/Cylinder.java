package ke_thua.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double height = 5.0;
    private double v;

    public Cylinder() {
    }

    public Cylinder(double height, double v) {
        this.height = height;
        this.v = v;
    }

    public Cylinder(double radius, String color, double height, double v) {
        super(radius, color);
        this.height = height;
        this.v = v;
    }

    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public void setV(double v) {
        this.v = v;
    }

    public double getV() {
        this.v = this.height * this.getRadius() * this.getRadius() * Math.PI;
        return this.v;
    }

    @Override
    public String toString() {
        return "A Cylinder with radius="
                + getRadius()
                + ", height="
                + getHeight()
                + ", Thể tích = "
                + getV()
                + ", which is a subclass of "
                + super.toString();
    }
}
