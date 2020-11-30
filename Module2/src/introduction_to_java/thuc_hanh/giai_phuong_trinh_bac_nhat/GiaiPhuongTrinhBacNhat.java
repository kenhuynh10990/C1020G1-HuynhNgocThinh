package introduction_to_java.thuc_hanh.giai_phuong_trinh_bac_nhat;
import  java.util.Scanner;
public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a:");
        double a= scanner.nextDouble();

        System.out.println("b:");
        double b= scanner.nextDouble();


        if (a!=0){
            double solution = -b/a;
            System.out.printf("the solution is: %f!", solution);
        } else if(b==0){
            System.out.println("the solution is all x!");
        } else {
            System.out.println("no solution!");
        }
    }
}
