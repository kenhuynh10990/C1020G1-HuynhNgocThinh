package services;

public class CaculatorService {
    public double caculator(double number1,double number2,String operator){

         double result =0;
        switch (operator){
            case "Additions(+)":
                result=number1+number2;
                break;
            case "Subtraction(-)":
                result=number1-number2;
                break;
            case "Multiplication(*)":
                result=number1*number2;
                break;
            case "Division(/)":
                result=number1/number2;
                break;
        }
        return result;
    }
}
