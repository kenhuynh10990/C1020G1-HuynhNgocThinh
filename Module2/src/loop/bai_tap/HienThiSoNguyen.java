package loop.bai_tap;

import java.util.Scanner;

public class HienThiSoNguyen {
    public static void main(String[] args) {

        int count =0;
        int i =0;
        while (i<100) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
                if (count == 20) {
                    break;
                }
            }
            i++;
        }


    }

    public static boolean isPrime(int num) {
        boolean test =true;
        if(num <2){
            test =false;
        } else {
            for(int i =2; i<num;i++){
                if (num%i==0){
                    test=false;
                    break;
                }
            }
        }
        return test;
    }
}
