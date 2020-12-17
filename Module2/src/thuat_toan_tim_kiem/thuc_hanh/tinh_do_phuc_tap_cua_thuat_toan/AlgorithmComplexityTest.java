package thuat_toan_tim_kiem.thuc_hanh.tinh_do_phuc_tap_cua_thuat_toan;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi:");
        String str = scanner.nextLine();

        int[] frequentChar= new int[255];
        for (int i = 0; i<str.length();i++){
            int ascii=(int) str.charAt(i);
            frequentChar[ascii]+=1;
        }

        int max =0;
        char character = (char) 255;
        for (int j =0;j<255;j++){
            if (frequentChar[j]>max){
                max = frequentChar[j];
                character=(char) j;
            }
        }
        System.out.println("The most appearing letter is " +character+" with a frequency of " +max+" times");

    }
}
