package java_08_files_nio;
/*
stwórz metodę o sygnaturze `public static void createFile (String fileName)`.

        1. Uzupełnij ciało metody tak, aby tworzyła plik o zadanej nazwie,
        2. sprawdzaj czy plik nie istnieje,
        3. wykorzystaj metody klas pakietu `java.nio.file` .*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main02 {
    public static void main(String[] args) {
        createFile ("file.txt");
    }

    private static void createFile(String fileName) {
        Path path = Paths.get(fileName);
        if (!Files.exists(path)){
            try {
                Files.createFile(path);
                System.out.println("Plik został utworzony");
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("Plik już isnieje");
        }
    }
}
