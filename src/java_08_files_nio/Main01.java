package java_08_files_nio;

/*
W pliku `Main01.java` stwórz metodę o sygnaturze `public static void createDirectory(String fileName)`.

        1. Uzupełnij ciało metody tak, aby tworzyła katalog o zadanej nazwie,
        2. sprawdzaj czy katalog nie istnieje,
        3. wykorzystaj metody klas pakietu `java.nio.file`:
         `Files.exists(directory)` oraz `Files.createDirectory(directory);`.
*/


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main01 {
    public static void main(String[] args) {
        createDirectory("Pliki");
    }

    private static void createDirectory(String fileName) {
        Path path = Paths.get(fileName);
        if (!Files.exists(path)){
            try {
                Files.createDirectory(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
