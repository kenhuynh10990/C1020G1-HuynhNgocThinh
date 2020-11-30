package introduction_to_java.thuc_hanh.tinh_so_can_nang_co_the;
import java.util.Scanner;
public class TinhChiSoCanNangCuaCoThe {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double bmi, weight,height;

        System.out.println("Nhập cân nặng:");
        weight = scanner.nextDouble();

        System.out.println("Nhập chiều cao:");
        height = scanner.nextDouble();

        bmi = weight/ Math.pow(height,2);

        System.out.println("Chỉ số bmi:" +bmi);

    }
}
