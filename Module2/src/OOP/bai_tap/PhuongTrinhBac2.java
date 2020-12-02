package OOP.bai_tap;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        double a = scanner.nextDouble();

        System.out.println("Nhập b:");
        double b = scanner.nextDouble();

        System.out.println("Nhập c:");
        double c = scanner.nextDouble();


        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double discriminant = quadraticEquation.getDiscriminant();
        System.out.println("Discriminant: \n" + discriminant);
        if(discriminant>=0){
            System.out.println("Root 1 :\n"+ quadraticEquation.getRoot1());
            System.out.println("Root 2: \n" + quadraticEquation.getRoot2());
        } else  {
            System.out.println("Phương trình vô nghiệm");
        }

    }
}
