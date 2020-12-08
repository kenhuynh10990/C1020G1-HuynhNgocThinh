package abstract_class.bai_tap.colorable;


import abstract_class.bai_tap.resizeable.ResizableRectangle;
import abstract_class.bai_tap.resizeable.ResizeableCircle;
import abstract_class.bai_tap.resizeable.ResizeableSquare;
import ke_thua.thuc_hanh.Shape;


public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new ResizeableCircle(2.0);
        shapes[1] = new ResizableRectangle(2.0, 3.0);
        shapes[2] = new ResizeableSquare(4.0);

        System.out.println("Pre-sorted:");

        for (Shape shape : shapes) {
            if (shape instanceof Colorable) {
                ResizeableSquare resizeableSquare = new ResizeableSquare();
                System.out.println(shape.getArea());
                resizeableSquare.howToColor();
            } else {
                System.out.println(shape.getArea());
            }
        }


    }
}
