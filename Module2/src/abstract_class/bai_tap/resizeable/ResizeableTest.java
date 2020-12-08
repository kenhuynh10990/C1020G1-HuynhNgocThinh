package abstract_class.bai_tap.resizeable;

import ke_thua.thuc_hanh.Circle;
import ke_thua.thuc_hanh.Rectangle;
import ke_thua.thuc_hanh.Shape;
import ke_thua.thuc_hanh.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[3];
       shapes[0]= new ResizeableCircle(2.0);
       shapes[1]=new ResizableRectangle(2.0,3.0);
       shapes[2]= new ResizeableSquare(4.0);

        System.out.println("Pre-sorted:");
       for (int i = 0; i<shapes.length;i++){
           System.out.println(shapes[i].getArea());
       }

        System.out.println("After-sorted:");
       shapes[0].resize(Math.random()*100);
       shapes[1].resize(Math.random()*100);
       shapes[2].resize(Math.random()*100);
       for (int i = 0 ; i<shapes.length;i++){
           System.out.println(shapes[i].getArea());


       }

    }
}
