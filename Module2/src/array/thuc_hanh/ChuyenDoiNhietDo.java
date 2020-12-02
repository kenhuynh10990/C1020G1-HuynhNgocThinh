package array.thuc_hanh;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        int choose = -1;
        Scanner choice = new Scanner(System.in);
        while (choose != 0) {
            System.out.println("1.Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit ");
            choose=choice.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Enter Fahrenheit: ");
                    Scanner scanner = new Scanner(System.in);
                    double f = scanner.nextFloat();
                    double c = (5.0 / 9) * (f - 32);
                    System.out.println(c+"C");
                    break;
                case 2:
                    System.out.println("Enter Fahrenheit: ");
                    Scanner scanner1 = new Scanner(System.in);
                    double c1 = scanner1.nextFloat();
                    double f1 = (9.0 / 5) * c1 + 32;
                    System.out.println(f1 +"F");
                    break;
                default:


            }
        }
    }
}
