package abstract_class.bai_tap.resizeable;

import ke_thua.thuc_hanh.Circle;

public class ResizeableCircle extends Circle implements Resizeable {
    public ResizeableCircle() {
    }

    public ResizeableCircle(double radius) {
        super(radius);
    }

    public ResizeableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public void resize(double percent) {
        this.setRadius(percent*getRadius());

    }
}
