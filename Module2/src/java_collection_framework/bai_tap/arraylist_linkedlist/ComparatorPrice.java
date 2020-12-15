package java_collection_framework.bai_tap.arraylist_linkedlist;

import java.util.Comparator;

public class ComparatorPrice implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return p2.getCost() - p1.getCost();
    }
}
