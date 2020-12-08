package clean_code.thuc_hanh.refactoring_doi_ten_bien;


public class Calculator {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';
    public static int calculate(int firstOperand, int secpndOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand +secpndOperand;
            case SUBTRACTION:
                return firstOperand - secpndOperand;
            case MULTIPLICATION:
                return firstOperand * secpndOperand;
            case DIVISION:
                if (secpndOperand != 0)
                    return firstOperand / secpndOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
