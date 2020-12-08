package abstract_class.bai_tap.resizeable;

import ke_thua.thuc_hanh.Rectangle;

public class ResizableRectangle extends Rectangle implements Resizeable {
    public ResizableRectangle() {
    }

    public ResizableRectangle(double width, double length) {
        super(width, length);
    }

    public ResizableRectangle(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }


    @Override
    public void resize(double percent) {
        this.setLength(percent*getLength());
        this.setWidth(percent * getWidth());
    }
}
