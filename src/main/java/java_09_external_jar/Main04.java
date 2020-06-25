package java_09_external_jar;

 /*
W pliku `Main04` napisz program, który sprawdzi czy zmienna `str`, znajdująca się w pliku, jest palindromem.
        Uwaga: podczas sprawdzania palindromu zignoruj spacje.*/

import org.apache.commons.lang3.StringUtils;

public class Main04 {
    public static void main(String[] args) {
        String str = "A to Ota";
        str = StringUtils.lowerCase(str);
        str = StringUtils.deleteWhitespace(str);
        if (str.equals(StringUtils.reverse(str))){
            System.out.println("jest palidromem");
        }else {
            System.out.println("Nie jest palidromem");
        }
    }
}
