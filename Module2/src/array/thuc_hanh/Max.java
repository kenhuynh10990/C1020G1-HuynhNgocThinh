package array.thuc_hanh;

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập size:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size không vượt quá 20");
            }
        } while (size > 20);

        array = new int[size];
        int i = 0;

        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        int max = array[0];
        int count =0;
        for (int j = 1; j < array.length; j++) {
            if(max<array[j]){
                max=array[j];
                count = j+1;
            }
        }
        System.out.println("Max is:"+max);

        System.out.println("Position:"+ count);
    }
}
