package java_01_methods;
//
//W pliku Main09.java napisz publiczną metodę factorial,
//        która przyjmie jako parametr liczbę naturalną n.
//        Metoda ma zwrócić wartość n!, czyli wynik mnożenia wszystkich liczb naturalnych w zakresie 1...n.

public class Main09 {
    public static void main(String[] args) {
        factorial(5);
    }

    private static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result = result * i;
        }
        System.out.println(result);
        return result;
    }
}
