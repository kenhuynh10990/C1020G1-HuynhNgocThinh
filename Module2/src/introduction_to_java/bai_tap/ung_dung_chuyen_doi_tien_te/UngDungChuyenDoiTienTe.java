package introduction_to_java.bai_tap.ung_dung_chuyen_doi_tien_te;
import java.util.Scanner;
public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double rate =23000;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số tiền USD cần đổi:");
        double usd= scanner.nextDouble();

        double vnd = usd*rate;
        System.out.println(usd+"USD = " + vnd+"VND");

    }
}
