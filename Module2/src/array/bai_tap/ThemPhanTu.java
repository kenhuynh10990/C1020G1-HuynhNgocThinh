package array.bai_tap;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6,0,0,0};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to add:");
        int number = scanner.nextInt();

        System.out.println("Enter index:");
        int index = scanner.nextInt();

        for (int i = array.length-1; i > index; i--) {
            array[i]=array[i-1];
        }
        array[index]=number;
        for (int value : array) {
            System.out.print(value + "\t");
        }


    }
}
