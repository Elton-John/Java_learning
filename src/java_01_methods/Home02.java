package java_01_methods;

// umieść metodę o sygnaturze `public static boolean divisibleBy(int a, int b )`:
//
//        1. Uzupełnij ciało metody tak aby zwracała `true` bądź `false` w zależności czy zmienna `a` jest podzielna przez `b`.

public class Home02 {
    public static void main(String[] args) {

        System.out.println(divisibleBy(10, 3));
    }

    private static boolean divisibleBy(int a, int b) {
        if (a % b == 0) {
            return true;
        } else {
            return false;
        }
    }
}
