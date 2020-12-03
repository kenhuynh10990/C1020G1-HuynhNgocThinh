package access_modifier.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle=new Circle(10,"blue");

        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
    }
}
