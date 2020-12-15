package stack_queue.bai_tap.dao_nguoc_phan_tu_dung_stack;


import java.util.Arrays;
import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        String name = "Long heo";
        reverseArr(array);
        System.out.println();
        reverseString(name);

    }

    public static void reverseArr(int[] array) {
        Stack<Integer> myStack = new Stack();
        for (int i : array) {
            myStack.push(i);
        }
        for (int j = 0; j < array.length; j++) {
            array[j] = myStack.pop();
        }
        System.out.print(Arrays.toString(array));

    }

    public static void reverseString(String a) {
        String[] array1 = a.split("\\s");
        Stack<String> myStack = new Stack<>();
        for (String s : array1) {
            myStack.push(s);
        }
        for (int j = 0; j < array1.length; j++) {
            array1[j] = myStack.pop();
        }
        String str = String.join("", array1);
        System.out.println(str);

    }
}
