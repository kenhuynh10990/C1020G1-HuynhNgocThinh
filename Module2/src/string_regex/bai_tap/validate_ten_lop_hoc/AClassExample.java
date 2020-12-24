package string_regex.bai_tap.validate_ten_lop_hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AClassExample {
    private static final String CLASS_REGEX= "[CAP][0-9]{4}(G|H|I|K|L|M)";

    public static void main(String[] args) {
        String a = "C0318G";
        System.out.println(a.matches(CLASS_REGEX));
    }
}
