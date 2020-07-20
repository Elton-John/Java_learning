package java_02_arrays;
//
//1. przy użyciu pętli `for` stwórz tablicę o nazwie `randNumbers`,
//        zawierającą 20 losowych liczb z zakresu `0-100` (do otrzymania losowej wartości użyj sposobu opisanego w snippetach),
//        3. wypisz w konsoli minimalną wartość z tablicy.

import java.util.Arrays;
import java.util.Random;

public class Main02 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] randNumbers = new int[20];
        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = random.nextInt(101);
        }
        System.out.println(Arrays.toString(randNumbers));

        Arrays.sort(randNumbers);
        int min = randNumbers[0];
        System.out.println(min);
    }
}
