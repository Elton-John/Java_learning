package java_02_arrays;

//umieść metodę o sygnaturze `public static int[] append(int[] arr)`.
//
//        1. Uzupełnij ciało metody tak, aby dla otrzymanej tablicy jej zawartość została skopiowana do tymczasowej tablicy,
//        której rozmiar ma być 2-krotnie większy od tablicy podanej.
//        2. Uzupełnij brakujące elementy tymczasowej tablicy elementami tablicy pierwotnej w odwrotnej kolejności.
//        3. Metoda ma zwrócić skopiowaną i uzupełnioną tablicę.
//        Przykład: dla tablicy int arr[] = {1,2,3}; ma zostać zwrócona tablica int arrTmp[] = {1,2,3,3,2,1};

import java.util.Arrays;

public class Home02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        append(arr);
    }

    private static int[] append(int[] arr) {
        int sizeOfFirstArr = arr.length;
        int[] result = Arrays.copyOf(arr, sizeOfFirstArr*2);

        for (int i = sizeOfFirstArr; i < result.length; i++) {
            sizeOfFirstArr--;
            result[i]= arr[sizeOfFirstArr];
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
