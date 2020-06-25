package java_09_external_jar;

/*
 umieść metodę o sygnaturze `public static String toggleChar(String str)`.
        Uzupełnij ciało metody tak, aby zamieniała duże litery na małe i odwrotnie, a następnie zwracała wynik.
        Przykład: dla napisu `TaK` wyświetli `tAk`.
*/


import org.apache.commons.lang3.StringUtils;

public class Main02 {
    public static void main(String[] args) {
        String str="TaK";
        String toggleStr = toggleChar(str);
        System.out.println(toggleStr);
    }

    private static String toggleChar(String str) {
        return StringUtils.swapCase(str);
    }
}
