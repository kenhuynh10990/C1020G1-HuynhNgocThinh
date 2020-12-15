package stack_queue.bai_tap.dau_ngoac;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biểu thức cần kiểm tra:");
        String a = scanner.nextLine();
        if(check(a)){
            System.out.println("Well");
        } else {
            System.out.println("Not well");
        }

    }

    public static boolean check(String a) {

        Stack<Character> myStack = new Stack<>();
        for (int index = 0; index < a.length(); index++) {
            char character = a.charAt(index);
            if (character == '(') {
                myStack.push(character);
            } else if (character == ')') {
                if (myStack.isEmpty() || myStack.pop() != '(') {
                    return false;
                }

            }

        }
        return myStack.empty();

    }
}
