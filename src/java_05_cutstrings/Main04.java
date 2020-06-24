package java_05_cutstrings;
/*
umieść metodę o sygnaturze `public static String[] onlyTwoElements(String str, char separator)`.
        Uzupełnij ciało metody tak, aby zwracała tablicę dwóch elementów, które powstały
        po podzieleniu tekstu (`str`) po pierwszym napotkanym znaku podziału (`separator`).

        Przykład:
        dla napisu `Java-zadania-podzial-napisow` oraz separatora `-` otrzymamy:
        1. pierwszy element tablicy: `Java`
        2. drugi element: `zadania-podzial-napisow`.*/

import java.util.Arrays;

public class Main04 {
    public static void main(String[] args) {
        String str = "Java-zadania-podzial-napisow` oraz separatora";
        onlyTwoElements(str, '-');
    }

    private static String[] onlyTwoElements(String str, char separator) {
        String[] strings = new String[2];
        int index = str.indexOf(separator);
        strings[0] = str.substring(0, index);
        strings[1] = str.substring(index + 1);
        System.out.println(Arrays.toString(strings));
        return strings;
    }
}
