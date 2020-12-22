package exception_debug.bai_tap;

import java.util.Scanner;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) throws IllegalTriangleException {
        if (a<=0||b<=0||c<=0|| a+b<c||a+c<b||b+c<a){
            throw new IllegalTriangleException();
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }

    }

}
