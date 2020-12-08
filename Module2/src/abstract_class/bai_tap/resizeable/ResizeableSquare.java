package abstract_class.bai_tap.resizeable;

import abstract_class.bai_tap.colorable.Colorable;
import ke_thua.thuc_hanh.Square;

public class ResizeableSquare extends Square implements Resizeable, Colorable {
    public ResizeableSquare() {
    }

    public ResizeableSquare(double side) {
        super(side);
    }

    public ResizeableSquare(double side, String color, boolean filled) {
        super(side, color, filled);
    }

    @Override
    public void resize(double percent) {
        this.setSide(percent*getSide());

    }

    @Override
    public void howToColor() {
        System.out.println("Color all for side");
    }
}
