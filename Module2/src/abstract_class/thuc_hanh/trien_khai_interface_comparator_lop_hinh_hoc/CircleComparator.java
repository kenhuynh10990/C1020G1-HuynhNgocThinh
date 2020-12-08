package abstract_class.thuc_hanh.trien_khai_interface_comparator_lop_hinh_hoc;

import ke_thua.thuc_hanh.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2){
        if(c1.getRadius()>c2.getRadius()){
            return 1;
        } else if (c1.getRadius()<c2.getRadius()){
            return -1;
        } else {
            return 0;
        }
    }
}
