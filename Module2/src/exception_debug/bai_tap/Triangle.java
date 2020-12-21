package exception_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập c: ");
        int c = scanner.nextInt();
        check(a,b,c);
    }
    public static void check(int a,int b,int c) throws IllegalTriangleException {
        if (a<0||b<0||c<0|| a+b<c||a+c<b||b+c<a){
            throw new IllegalTriangleException();
        } else {
            System.out.println("Đây là 3 cạnh của 1 tam giác. ");
        }
    }
}
