package java_02_arrays;

//1. stwórz tablicę o nazwie `numbers` zawierającą 10 dowolnych liczb,
//        2. stwórz zmienną tablicową `reverse` i umieść w niej elementy tablicy `numbers` w odwrotnej kolejności,
//        3. wypisz na konsoli elementy z tablicy `reverse`.
//
//        Dla tablicy o elementach:
//        ```
//        3, 5, 7, 2, 1
//        ```
//        otrzymamy wynik:
//        ```
//        1, 2, 7, 5, 3
//        ```

import java.util.Arrays;
import java.util.Random;

public class Main04 {
    public static void main(String[] args) {

        int[] numbers = {1, 22, 33, 4, 55, 66, 7, 88, 99, 100};
        System.out.println(Arrays.toString(numbers));

        int[] revers = new int[numbers.length];
        int j = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {
            revers[i] = numbers[j];
            j--;
        }

        System.out.println(Arrays.toString(revers));
    }
}
