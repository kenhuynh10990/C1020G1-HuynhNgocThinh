package danh_sach.bai_tap.linkedlist;


public class MyLinkedList<E> {
    private Node head;
    private int numNode;

    private static class Node {
        public Node next;
        public Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public MyLinkedList() {

    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNode++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNode++;
    }

    public void addLast(E e) {
        if (head == null) {
            head = new Node(e);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(e);
        }
        numNode++;

    }

    public E remove(int index) {
        if (index < 0 || index >= numNode) {
            throw new IndexOutOfBoundsException();
        } else {
            if (index == 0) {
                E removed = (E) new Object();
                removed = (E) head.getData();
                Node temp = head;
                head = head.next;
                numNode--;
                return removed;
            } else {
                Node temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                E removed = (E) new Object();
                removed = (E) temp.next.getData();
                temp.next = temp.next.next;
                numNode--;
                return removed;
            }
        }
    }

    public int size() {
        return numNode;
    }

    public MyLinkedList<E> clone() {
        MyLinkedList<E> listClone = new MyLinkedList<>();
        Node temp = head;
        for (int i = 0; i < numNode; i++) {
            listClone.addLast((E) temp.getData());
            temp = temp.next;
        }
        return listClone;
    }

    public boolean contain(E o) {
        boolean test = false;
        Node temp = head;
        for (int i = 0; i < numNode; i++) {
            if (o.equals(temp)) {
                return test = true;
            }
            ;
            temp = temp.next;
        }
        return test;
    }

    public int indexOf(E o) {
        int index = 0;
        for (int i = 0; i < numNode; i++) {
            if (o.equals(head)) {
                index = i;
            }
            head = head.next;
        }
        return index;
    }

    public E get(int i) {
        if (i < 0 || i >= numNode) {
            throw new IndexOutOfBoundsException();
        } else {
            int index = 0;
            Node temp = head;
            while (index == i) {
                temp = temp.next;
                index++;
            }
            return (E) temp.getData();
        }
    }

    public E getFirst() {
        return (E) head.getData();
    }

    public E getLast() {
        Node temp = head;
        for (int i = 0; i < numNode - 1; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    public void clear() {
        head = null;
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            for (int i = 0; i < numNode; i++) {
                System.out.println(temp.getData());
                temp = temp.next;
            }
        } else {
            System.out.println("Empty list");
        }
    }

}
