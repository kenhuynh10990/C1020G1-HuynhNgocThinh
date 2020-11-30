package introduction_to_java.bai_tap.ung_dung_doc_so_thanh_chu;
import java.util.Scanner;
public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int remainder = 0;
        int tens = 0;
        if(num < 0){
            System.out.print("Negative ");
            num = num*(-1);
            if (num > 0 && num < 10) {
                displayNumberLessThan10(num);
            }
            if (num >= 10 && num < 20) {
                if (num == 10 || num == 11 || num == 12 || num == 15) {
                    switch (num) {
                        case 11:
                            System.out.print("eleven");
                            break;
                        case 12:
                            System.out.print("twelve");
                            break;
                        case 13:
                            System.out.print("thirdteen");
                            break;
                        case 15:
                            System.out.print("fifteen");
                            break;
                    }
                } else {
                    num = num % 10;
                    displayNumberLessThan10(num);
                    System.out.print("teen");
                }
            }
            if (num >= 20 && num < 100) {
                remainder = num % 10;
                num -= remainder;
                displayNumberLessThan100(num);
                displayNumberLessThan10(remainder);
            }
            if(num >= 100 && num < 1000) {
                remainder = num % 10;
                num = num / 10;
                tens = (num % 10) * 10;
                num /= 10;
                displayNumberLessThan10(num);
                System.out.print(" hundred ");
                if (tens == 10) {
                    System.out.print("ten ");
                    displayNumberLessThan10(remainder);
                } else {
                    displayNumberLessThan100(tens);
                    displayNumberLessThan10(remainder);
                }
            }
        }else{
            if (num > 0 && num < 10) {
                displayNumberLessThan10(num);
            }
            if (num >= 10 && num < 20) {
                if (num == 10 || num == 11 || num == 12 || num == 15) {
                    switch (num) {
                        case 11:
                            System.out.print("eleven");
                            break;
                        case 12:
                            System.out.print("twelve");
                            break;
                        case 13:
                            System.out.print("thirdteen");
                            break;
                        case 15:
                            System.out.print("fifteen");
                            break;
                    }
                } else {
                    num = num % 10;
                    displayNumberLessThan10(num);
                    System.out.print("teen");
                }
            }
            if (num >= 20 && num < 100) {
                remainder = num % 10;
                num -= remainder;
                displayNumberLessThan100(num);
                displayNumberLessThan10(remainder);
            }
            if(num >= 100 && num < 1000) {
                remainder = num % 10;
                num = num / 10;
                tens = (num % 10) * 10;
                num /= 10;
                displayNumberLessThan10(num);
                System.out.print(" hundred ");
                if (tens == 10) {
                    System.out.print("ten ");
                    displayNumberLessThan10(remainder);
                } else {
                    displayNumberLessThan100(tens);
                    displayNumberLessThan10(remainder);
                }
            }
        }
    }
    public static void displayNumberLessThan10 ( int num){
        switch (num) {
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.print("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("eight");
                break;
            case 9:
                System.out.print("nine");
        }
    }
    public static void displayNumberLessThan100 ( int number){
        switch (number) {
            case 20:
                System.out.print("twenty ");
                break;
            case 30:
                System.out.print("thirty ");
                break;
            case 40:
                System.out.print("fourty ");
                break;
            case 50:
                System.out.print("fifty ");
                break;
            case 60:
                System.out.print("sixty ");
                break;
            case 70:
                System.out.print("seventy ");
                break;
            case 80:
                System.out.print("eighty ");
                break;
            case 90:
                System.out.print("ninety ");
                break;
        }
    }
}