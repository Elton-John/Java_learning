package java_01_methods.java_01_methods;

//W pliku Main08.java napisz publiczną metodę maxOfThree,
//        która przyjmie trzy parametry liczbowe. Metoda ma zwrócić największą liczbę.

import org.w3c.dom.ls.LSOutput;

public class Main08 {
    public static void main(String[] args) {
        System.out.println(maxOfThree(3,3,-58));
    }

    private static int maxOfThree(int a, int b, int c) {
        int result = 0;
        if (a > b && a > c) {
            result = a;
        } else if (b > a && b > c) {
            result = b;
        } else if (c > a && c > b) {
            result = c;
        }else {
            System.out.println("nie można porównać");
        }
        return result;
    }
}
