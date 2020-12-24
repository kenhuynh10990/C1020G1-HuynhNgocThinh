package string_regex.bai_tap.validate_phone;

public class ValidatePhone {
    private static final String PHONE_REGEX= "[(][0-9]{2}[)][-][(][0][0-9]{9}[)]";

    public static void main(String[] args) {
        String a = "(84)-(0978489648)";
        System.out.println(a.matches(PHONE_REGEX));

    }
}
