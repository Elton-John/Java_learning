package java_14_regex;
//Napisz metodę static boolean verifyPassword(String password), która zwróci true jeżeli ciąg znaków:
//        Ma od 10 do 15 znaków.
//        Ma minimum jedną małą literę.
//        Ma minimum jedną wielką literę.
//        Nie zawiera dwóch wielkich lub dwóch małych liter z rzędu.
//        false w przeciwnym wypadku.
//
//        Wykorzystaj wyrażenia regularne. Warunki możesz sprawdzać oddzielnie.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main02 {
    public static void main(String[] args) {
        String passwordFalse01 = "45664";
        String passwordFalse011 = "1234567890123456789";
        String passwordFalse02 = "1234567891011";
        String passwordFalse03 = "lllllllllllll";
        String passwordFalse04 = "llPPllPPLLppLL";
        String passwordTrue = "lA2La5678910";
        System.out.println(verifyPassword(passwordFalse01));
        System.out.println(verifyPassword(passwordFalse011));
        System.out.println(verifyPassword(passwordFalse02));
        System.out.println(verifyPassword(passwordFalse03));
        System.out.println(verifyPassword(passwordFalse04));
        System.out.println(verifyPassword(passwordTrue));
    }

    private static boolean verifyPassword(String password) {
        boolean isCorrect = true;
        String condition01 = "\\w{10,15}";
        String condition02 = "[a-z]+";
        String condition03 = "[A-Z]+";
        String condition04Not = "([a-z][a-z])+";
        String condition041Not = "([A-Z][A-Z])+";


        if (!password.matches(condition01)) {
            isCorrect=false;
            System.out.println("hasło powinno mieć więcej niz 10 znaków i mniej niż 15");
        } else if (!password.matches(condition02)){
            isCorrect=false;
            System.out.println("hasło powinno zawierać co najmniej jedną małą literę");
        } else if (!password.matches(condition03)){
            isCorrect = false;
            System.out.println("hasło powinno zawierać co najmniej jedną dużą literę");
        }else if (password.matches(condition04Not)){
            isCorrect=false;
            System.out.println("hasło nie może zawierać dwie małe litery obok siebie");
        } else if (password.matches(condition041Not)){
            isCorrect = false;
            System.out.println("hasło nie może zawierać dwie duże litery obok siebie");
        }
        return isCorrect;
    }

}
