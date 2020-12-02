package array.thuc_hanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        String student [] = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên :");
        String name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(name)) {
                System.out.println("Position of the students in the list " + name + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Not found" + name + " in the list.");

    }
}
