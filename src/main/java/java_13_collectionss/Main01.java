package java_13_collectionss;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//        W pliku `Main01.java`
//
//        1. W metodzie `main` utwórz listę o nazwie `elements` przechowującą elementy typu Integer.
//        2. Dodaj do kolekcji 10 elementów od 10 do 19.
//        3. Wypisz elementy na konsoli używając pętli for.
//        4. Wypisz elementy na konsoli używając iteratora i pętli while.
//        5. Wypisz na konsoli elementy używając iteratora i pętli for.
//        6. Wypisz na konsoli elementy używając konstrukcji for-each.
public class Main01 {
    public static void main(String[] args) {
        List<Integer> elements = new ArrayList<>();
        for (int i = 10; i < 20; i++) {
            elements.add(i);
        }

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }

        System.out.println();

        Iterator<Integer> iterator = elements.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        iterator = elements.iterator();
        for (int i = 0; i < elements.size(); i++) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        for (int element :
                elements) {
            System.out.print(element + " ");
        }

    }

}
