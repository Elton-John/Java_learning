package java_06_input;
/*
stwórz metodę o sygnaturze `public static void getData()`.

        Uzupełnij ciało metody tak, aby:

        1. wczytywała liczby z konsoli do momentu wprowadzania 0 (ale nie włączając go do sumy liczb),
        2. sumowała ich wartość oraz liczbę.
        Wywołaj metodę w metodzie `main`.*/

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        getDate();
    }

    private static void getDate() {
        double sum = 0;
        int number = 0;
        double input;
        Scanner scanner = new Scanner(System.in);
        input = getDouble(scanner);
        while (input != 0){
            sum=sum+input;
            number++;
            input = getDouble(scanner);
        }
        System.out.println("Wprowadzono liczb: " + number);
        System.out.println("Suma liczb: " + sum);
    }

    private static double getDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("podaj liczbę");
        }
        return scanner.nextDouble();
    }
}
