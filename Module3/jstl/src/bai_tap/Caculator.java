package bai_tap;

public class Caculator {
    public static float caculate( float number1, float number2, String operator){
        switch (operator){
            case "+":
                return number1+number2;
            case "-":
                return number1-number2;
            case"*":
                return number1*number2;
            case "/":
                if(number2 != 0)
                    return number1 / number2;
                else
                    throw new RuntimeException("Can't divide by zero");
            default:
                throw new RuntimeException("Invalid operation");
        }

    }
}
