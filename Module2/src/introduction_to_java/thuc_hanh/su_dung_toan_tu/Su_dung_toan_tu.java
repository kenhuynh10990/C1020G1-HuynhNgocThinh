package introduction_to_java.thuc_hanh.su_dung_toan_tu;
import java.util.Scanner;
public class Su_dung_toan_tu {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner= new Scanner(System.in);
        System.out.println("enter width: ");
        width= scanner.nextFloat();

        System.out.println("enter height ");
        height=scanner.nextFloat();

        float area = width*height;
        System.out.println("area is :"+area);
    }
}
