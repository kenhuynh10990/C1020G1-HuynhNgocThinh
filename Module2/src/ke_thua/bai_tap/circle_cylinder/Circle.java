package ke_thua.bai_tap.circle_cylinder;

public class Circle {
    private double radius =1.0;
    private String color;
    private double dientich;

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDientich() {
        this.dientich = this.radius * this.radius * Math.PI;
        return dientich;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + " Diện tích ="
                + getDientich();

    }
}
