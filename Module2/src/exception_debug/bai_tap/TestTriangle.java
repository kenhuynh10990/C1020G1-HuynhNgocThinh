package exception_debug.bai_tap;

import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập c: ");
        int c = scanner.nextInt();
        try {
            Triangle triangle = new Triangle(a,b,c);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        }
        System.out.println("hkhkkhhkhkhk");
    }
}
