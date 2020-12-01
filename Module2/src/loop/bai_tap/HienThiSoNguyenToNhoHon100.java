package loop.bai_tap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {


        int i =0;
        while (i<100) {
            if (isPrime(i)) {
                System.out.println(i);

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
