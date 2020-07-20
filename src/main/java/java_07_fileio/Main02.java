package java_07_fileio;
/*
napisz program, który będzie wczytywał kolejne linie tekstu z pliku `text1.txt`,
        a następnie wypisze je na konsoli.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        File file = new File("text.txt");
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()){
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
