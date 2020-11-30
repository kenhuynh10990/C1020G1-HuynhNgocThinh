package introduction_to_java.thuc_hanh.kiem_tra_nam_nhuan;
import java.util.Scanner;
public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập năm muốn kiểm tra:");

        int year = scanner.nextInt();

        if(year %4==0 && year %100!=0 || year%100==0 && year%400==0 ){
            System.out.printf("Năm '%d' là năm nhuận",year);
        } else {
            System.out.printf("Năm '%d' không phải năm nhuận",year);
        }
    }
}
