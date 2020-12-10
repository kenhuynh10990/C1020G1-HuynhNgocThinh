package danh_sach.bai_tap.linkedlist;


public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();

        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);
        linkedList.addLast(47);

        linkedList.add(4, 9);
        linkedList.add(4, 9);

        linkedList.display();
        System.out.println("After remove:");

        linkedList.remove(2);
        linkedList.display();

        System.out.println("Size: " + linkedList.size());

        linkedList.clone().display();

    }
}
