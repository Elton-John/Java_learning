package java_07_fileio;

/*
W pliku `Main03.java` napisz program, który będzie wczytywał kolejne linie tekstu z pliku tekstowego
        wypełnionego poniższą zawartością:*/
/*1.1, 1.2, 1.3, 2.0, 1.8
        1.3, aa, 4.5, 6.7, 2.1
        3.5, 7.7, 9.9, 4.1, 2.1
        ````
        Jeżeli dane są poprawnymi danymi liczbowymi, program policzy ich sumę, jeśli nie – ma je pomijać.
        Następnie sumę ma zostać wypisana na konsoli.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main03 {
    public static void main(String[] args) {
        double sum = 0;
        File file = new File("text.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] tabLine = line.split(",");
                sum = addTosum(tabLine, sum);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(sum);
    }

    private static double addTosum(String[] tabLine, double sum) {
        for (String each :
                tabLine) {
            try {
                sum = sum + Double.parseDouble(each);
            } catch (NumberFormatException ignored) {
            }
        }
        return sum;
    }
}
