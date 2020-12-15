package stack_queue.bai_tap.kiem_tra_chuoi_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Ela";
        if (check(str)) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }

    }

    public static boolean check(String test) {
        String a = test.toUpperCase();
        char[] array = a.toCharArray();
        Stack<Character> myStack = new Stack<>();
        Queue<Character> myQueue = new LinkedList<>();
        for (char s : array) {
            myQueue.add(s);
            myStack.push(s);
        }
        boolean dbcheck = false;
        for (int index = 0; index < myStack.size(); index++) {
            if (myStack.pop().equals(myQueue.poll())) {
                dbcheck = true;
            } else {
                dbcheck = false;
                break;
            }
        }
        return dbcheck;


    }
}
