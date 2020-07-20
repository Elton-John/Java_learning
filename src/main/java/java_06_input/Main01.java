package java_06_input;
/*
 stwórz metodę o sygnaturze `public static void getInfo()`.

        W ciele metody dodaj kod, który:

        1. poprosi Cię o podanie imienia,
        2. poprosi Cię o podanie wieku,
        3. wypisze na konsoli informacje w formacie `"{imię} ma {wiek} lat"`.
        Wywołaj metodę w metodzie `main`.*/

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        getInfo();
    }

    private static void getInfo() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj imię: ");
            String name = scanner.nextLine();
            System.out.println("Podaj nazwisko: ");
            String surname = scanner.nextLine();
            System.out.println(name + " "+ surname);
        }
    }
}
