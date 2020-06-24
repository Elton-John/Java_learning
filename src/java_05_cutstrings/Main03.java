package java_05_cutstrings;

/*
1. umieść metodę o sygnaturze `public static int countTokens(String str)`,
        2. uzupełnij ciało metody tak, aby zwracała liczbę wyrazów w podanym ciągu znaków.

        Metoda powinna pomijać białe znaki.

        Przykład:
        dla `String str = "   To jest  tekst do   ";` mamy otrzymać wartość **4**;*/

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main03 {
    public static void main(String[] args) {
        String str = "   To jest  tekst do   ";
        countTokens(str);

    }

    private static int countTokens(String str) {
        int result = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(str, " ");
        result = stringTokenizer.countTokens();
        System.out.println(result);
        return result;
    }
}

//
//    String strWithoutDoubleSpace = str.replaceAll("  "," ");
//    String withoutSpace = strWithoutDoubleSpace.trim();
//    String[] tabOfwords = withoutSpace.split(" ");
//        result = tabOfwords.length;
//                System.out.println(Arrays.toString(tabOfwords));
//                System.out.println(result);