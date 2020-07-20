package java_02_arrays;

//
//1. stwórz tablicę o nazwie `numbers` zawierającą 10 dowolnych liczb,
//        2. posortuj rosnąco tablicę wykorzystując metody klasy `Arrays`,
//        3. wyświetl w konsoli posortowaną tablicę – również przy pomocy metody z klasy `Arrays`.

import java.util.Arrays;

public class Main05 {
    public static void main(String[] args) {
        int[] numbers = {1, 22, 33, 4, 55, 66, 7, 88, 99, 100};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
