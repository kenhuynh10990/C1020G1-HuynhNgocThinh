package stack_queue.bai_tap.chuyen_doi_tu_he_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class DecToBinary {
    public static void main(String[] args) {
        System.out.println("Nhập số cần đổi: ");
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        change(number);

    }

    public static void change(int number){
        Stack <Integer> myStack = new Stack<>();
        while (number!=0) {
            int mod = number % 2;
            myStack.push(mod);
            number/=2;
        }
        while (!myStack.isEmpty()){
            System.out.print(myStack.pop()+"\t");
        }


    }
}
