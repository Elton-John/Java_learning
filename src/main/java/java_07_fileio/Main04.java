package java_07_fileio;
/*
napisz program, który:

        1. wczyta zawartość z załączonego pliku text4.txt,
        2. wypisze na konsoli wszystkie linie zawierające napis **Javy**, ignorując wielkość znaków w nazwie.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        File file = new File("text4.txt");
        String line;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()){
                line = scanner.nextLine();
               // line = line.toLowerCase();
                if (line.contains("Javy")){
                    System.out.println(line+"\n");
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
