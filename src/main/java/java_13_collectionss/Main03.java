package java_13_collectionss;
//
//Utwórz klasę `City`,  dodaj w niej atrybuty:
//        * name (String)
//        * population (int)
//
//        Klasa powinna mieć też konstruktor przyjmujący wszystkie 2 parametry
//
//        Następnie w pliku `Main03.java`:
//        1. Napisz metodę `public static List<City> initialize()`, która utworzy 5 obiektów klasy `City`,
//        doda je do listy, którą następnie zwróci.
//        2. Napisz metodę `public static List<City> firstSubList(List<City> list, int start, int end )`,
//        która zwróci sublistę elementów listy `list` o początku `start` i końcu `end`. Wykorzystaj dowolną pętlę.
//        3. Napisz metodę `public static List<City> secondSubList(List<City> list, int start, int end )`,
//        która zwróci sublistę elementów listy `list` o początku `start` i końcu `end`.
//        Wykorzystaj wbudowaną metodę `List.subList(int fromIndex, int toIndex)`.

import java.util.ArrayList;
import java.util.List;

public class Main03 {
    public static void main(String[] args) {
List<City> listOfCities = initialize();

    }

    private static List<City> initialize() {
        List<City> resultList = new ArrayList<>();
        resultList.add(new City("Warszawa", 1000000));
        resultList.add( new City("Mińsk", 1200000));
        resultList.add( new City("Wrocław", 150000));


        return resultList;
    }
}
