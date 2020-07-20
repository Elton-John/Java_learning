package java_02_arrays;

//umieść metodę o sygnaturze `public static int[] returnUnique(int[] arr)`.
//        1. Uzupełnij ciało metody w taki sposób by z tablicy `arr` wybrała tylko unikalne wartości,
//        które następnie mają być zwrócone z metody.

import java.util.Arrays;

public class Home01 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 2, 5, 6};
        returnUnique(arr);
    }

    private static int[] returnUnique(int[] arr) {
        int[] result = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (isUnique(arr[i], result)) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = arr[i];
            }
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    private static boolean isUnique(int i, int[] arr) {
        boolean check = true;
        for (int j = 0; j < arr.length; j++) {
            if (i == arr[j]) {
                check = false;
            } else {
                check = true;
            }
        }
        return check;
    }
}
