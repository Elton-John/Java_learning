package java_09_external_jar;

/*
umieść metodę o sygnaturze `public static String stringFromArray(String[] str)`.
        Uzupełnij ciało metody tak, aby zwracała napis powstały z połączenia wszystkich napisów występujących w tablicy `str`.
*/


import org.apache.commons.lang3.StringUtils;

public class Main03 {
    public static void main(String[] args) {
        String[] arr = {"Kot","to", "radość"};
        String result = stringFromArray(arr);
        System.out.println(result);
    }

    private static String stringFromArray(String[] arr) {
        String result = StringUtils.join(arr, " ");
        return result;
    }
}
