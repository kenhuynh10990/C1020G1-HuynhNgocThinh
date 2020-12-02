package array.bai_tap;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int value : array) {

            System.out.print(value);
        }

        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value to delete:");
        int delete = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == delete) {
                System.arraycopy(array, i + 1, array, i, array.length - 1 - i);
                array[array.length - 1] = 0;

            }
        }
        for (int element : array) {
            System.out.print(element);
        }
    }
}