package java_06_input;

import java.util.Scanner;

/*W pliku `Main02.java` stwórz metodę o sygnaturze `public static void operations()`.

Uzupełnij ciało metody tak, by wczytała 2 liczby, a następnie wyświetliła na konsoli wyniki:  
1. dodawania,
2. odejmowania,
3. mnożenia,
4. dzielenia.  
Wywołaj metodę w metodzie `main`.*/

public class Main02 {
    public static void main(String[] args) {
        operation();
    }

    private static void operation() {
        double a;
        double b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierszą liczbę");
        a = getDouble(scanner);

        System.out.println("Podaj drugą liczbę");
        b = getDouble(scanner);

        double odejmowanie = a - b;
        System.out.println(a + " - " + b + " = " + odejmowanie);
        double dodawanie = a + b;
        System.out.println(a + " + " + b + " = " + dodawanie);
        double mnozenie = a * b;
        System.out.println(a + " x " + b + " = " + mnozenie);
        double dzielenie = 0;
        try {
            dzielenie = a / b;
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        }
        System.out.println(a + " / " + b + " = " + dzielenie);
    }

    private static double getDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("podaj liczbę");
        }
        return scanner.nextDouble();
    }
}
