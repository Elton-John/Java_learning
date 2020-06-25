package java_08_files_nio;
/*
stwórz metodę o sygnaturze `public static void copyFile(String directory, String fileName, String secondFileName)`.
        Następnie:

        1. uzupełnij ciało metody tak, aby z katalogu `directory` kopiowała plik o nazwie `fileName` do pliku o nazwie `secondFileName`.
        2. sprawdzaj czy plik nie istnieje.*/

import java.io.IOException;
import java.nio.file.*;

public class Main03 {
    public static void main(String[] args) {
        String directory = "Pliki";
        String fileName= "file.txt";
        String secondFilename = "file2.txt";
        copyFile(directory, fileName,secondFilename);
    }

    private static void copyFile(String directory, String fileName, String secondFilename) {
        Path path= Paths.get(directory,fileName);
        Path secondPath = Paths.get(directory,secondFilename);
        try {
            Files.copy(path,secondPath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
