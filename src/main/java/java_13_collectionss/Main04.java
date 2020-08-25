package java_13_collectionss;
//Napisz program który w metodzie main będzie w pętli pobierał z konsoli napisy,
//        do momentu podania exit.
//        Pobrane od użytkownika napisy dodawaj do kolekcji typu Set.
//        Utwórz zmienną typu int o nazwie count i wartości początkowej 0.
//        Po pobraniu napisu zwiększaj wartość zmiennej count.
//        Testując program podaj kilkukrotnie ten sam napis.
//        Po wpisaniu exit wypisz na konsoli: Podanych napisów:
//        [liczba napisów], Rozmiar kolekcji: [liczba elementów w kolekcji]

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main04 {
    public static void main(String[] args) {
        Set<String > set = new HashSet<>();
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("exit")){
            set.add(input);
            count++;
            input = scanner.nextLine();
        }
        System.out.println("Pobranych napisów: " + count);
        System.out.println("Rozmiar kolekcji: " + set.size());
    }
}
