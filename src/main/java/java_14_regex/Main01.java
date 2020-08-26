package java_14_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//W pliku Main01.java
//
//        Napisz metodę static boolean verifyEmail(String email), która zwróci true jeżeli podany parametr jest
//        poprawnym adresem email, false w przeciwnym wypadku.
//        Wykorzystaj wyrażenia regularne.
public class Main01 {
    public static void main(String[] args) {
        String email = "dinosa2urus@g.com";
        System.out.println(verifyEmail(email));
    }

    private static boolean verifyEmail(String email) {
        Pattern emailPattern = Pattern.compile("\\w+@[a-z]+\\.[a-z]+", Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPattern.matcher(email);
        return matcher.matches();
    }
}
