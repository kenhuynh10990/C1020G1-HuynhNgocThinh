package danh_sach.bai_tap.arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object[] element = new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    public MyList(int capacity) {
        Object element[] = new Object[capacity];
        for (int i = 0; i < capacity; i++) {
            add((E) element[i]);
        }
    }

    public void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }

    public void add(int index, E e) {
        for (int i = size - 1; i >= index; i--) {
            element[i + 1] = element[i];
        }
        element[index] = e;

    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException
                    ("index " + index + " out of bounds");
    }

    public E remove(int index) {
        checkIndex(index);

        E e = (E) element[index];
        if (size - 1 - index >= 0) System.arraycopy(element, index + 1, element, index, size - 1 - index);

        element[size - 1] = null;
        size--;
        return e;
    }

    public int size() {
        return size;
    }

    public boolean contain(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(element[i])) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E e) {
        for (int i = 0; i < size; i++) {
            if (e.equals(element[i])) {
                return i;
            }
        }
        return -1;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index:" + i + "'Size" + i);
        }
        return (E) element[i];
    }

    public void clear() {
        element = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }
}
