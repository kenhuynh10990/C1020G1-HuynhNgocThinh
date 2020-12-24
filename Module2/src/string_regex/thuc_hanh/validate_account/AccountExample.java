package string_regex.thuc_hanh.validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private static final String ACCOUNT_REGEX= "[_a-z0-9]{6,}";
    private static Pattern pattern;
    private Matcher matcher;
    public AccountExample(){

    }
    public boolean validate(String regex){
        pattern = Pattern.compile(ACCOUNT_REGEX);
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
