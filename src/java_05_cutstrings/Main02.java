package java_05_cutstrings;
/*
znajduje się zmienna `str`. Napisz program, który:

        1. podzieli podany ciąg znaków na zdania – znakiem podziału jest kropka `(.)`,
        2. wyświetli na konsoli każde zdanie w oddzielnej linii.*/

public class Main02 {
    public static void main(String[] args) {
        String str = "Z Coders Lab niezależnie od wykształcenia możesz zmienić swoją karierę." +
                " Jesteśmy szkołą oferującą bardzo intensywne kursy programowania." +
                " Przygotujemy Cię do pracy na stanowisku junior web developera i pomożemy znaleźć zatrudnienie po kursie.";
        String[] tabStr = str.split("\\.");
        for (String line :
                tabStr) {
            System.out.println(line);
        }

    }
}
