package java_02_arrays;

//
//1. stwórz tablicę o nazwie `numbers` zawierającą 10 dowolnych liczb,
//        2. stwórz drugą tablicę, nazwij ją `secondNumbers`, wypełnij 10 dowolnymi liczbami,
//        3. stwórz trzecią tablicę zawierającą sumy elementów, które mają w tablicach pozycję o tym samym indeksie.
//
//        Dla przykładowych tablic:
//        ```java
//        int[] numbers = {2, 3};
//        int[] secondNumbers = {3, 4};
//        ```
//        wynikiem będzie tablica o elementach `5 i 7`.

import java.util.Arrays;

public class Main06 {
    public static void main(String[] args) {
        int[] numbers = {1, 22, 33, 4, 55, 66, 7, 88, 99, 100};
        int[] secondNumbers = {0, 5, 52, 44, 85, 76, 27, 28, 39, 10};
        int[] sum = new int[10];
        for (int i = 0; i < sum.length; i++) {
            sum[i] = numbers[i] + secondNumbers[i];
        }
        System.out.println(Arrays.toString(sum));
    }
}
