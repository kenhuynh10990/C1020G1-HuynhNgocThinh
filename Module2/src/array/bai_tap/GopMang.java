package array.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] array = new int[5];
        int array2[] = new int[5];
        int array3[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            array3[i] = array[i];
        }
        System.out.printf("%-20s%s", "Elements in array1: ", "");

        for (int value : array) {
            System.out.print(value + "\t");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
            array3[array.length + i] = array2[i];
        }
        System.out.printf("%-20s%s", "Elements in array 2: ", "");
        for (int value1 : array2) {
            System.out.print(value1);
        }
        System.out.println();
        System.out.printf("%-20s%s", "Elements in array3: ", "");
        for (int value1 : array3) {
            System.out.print(value1+"\t");
        }
    }
}

