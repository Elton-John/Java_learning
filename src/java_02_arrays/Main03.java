package java_02_arrays;

//
//1. stwórz 10-elementową tablicę wypełnioną pojedynczą wartością "2". Tablica powinna wyglądać następująco:
//        ````
//        [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
//        ````
//        2. zadanie wykonaj **bez użycia pętli `for`**.

import java.util.Arrays;

public class Main03 {
    public static void main(String[] args) {
        int[] tab = new int[10];
        Arrays.fill(tab,2);
        System.out.println(Arrays.toString(tab));
    }
}
