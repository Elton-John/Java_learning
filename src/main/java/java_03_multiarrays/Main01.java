package java_03_multiarrays;
//
//znajduje się tablica o nazwie ```task1Array```.
//
//        1. Wypisz element znajdujący się w 3 kolumnie i 2 wierszu,
//        2. wypisz długość tablicy znajdującej się w drugim rzędzie,
//        3. wypisz element znajdujący się w 4 kolumnie i 3 wierszu.

public class Main01 {
    public static void main(String[] args) {
        int[][] task1Array = {{2, 3, 4},
                {12, 32, 12, 11},
                {3, 2, 1, 4, 5},
                {5, 1, 6, 7, 8}};
        System.out.println(task1Array[2][1]);
        System.out.println(task1Array[1].length);
        System.out.println(task1Array[3][2]);
    }
}
