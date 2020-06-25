package java_08_files_nio;

/*
stwórz metodę o sygnaturze `public static void writeToFile(String fileName)`.
        Uzupełnij ciało metody tak, aby:

        1. utworzyła (jeżeli nie istnieje) plik o nazwie `fileName`.
        2. pobierała z konsoli całe linie, a następnie zapisywała je do pliku. Wykorzystaj odpowiednią metodę klasy `Scanner`.
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        String fileName = "plikzkonsoli.txt";
        writeToFile(fileName);
    }

    private static void writeToFile(String fileName) {
        Path path = Paths.get(fileName);
        if (!Files.exists(path)) {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Napisz coś: ");
        String line = scanner.nextLine();

//        try {
//            Files.write(path, Collections.singleton(line));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(file, true)) {
            fileWriter.append("\n" + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
