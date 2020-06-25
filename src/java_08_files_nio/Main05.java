package java_08_files_nio;

/*
stwórz metodę o sygnaturze `public static void readFromFile(String fileName)`.
        Uzupełnij ciało metody tak, aby:

        1. wczytała zawartość pliku podanego w parametrze metody (sprawdzaj czy istnieje plik źródłowy),
        2. utworzyła nowy plik o rozszerzeniu `html` i nazwie takiej samej jak plik wczytywany,
        3. wpisywała do nowego pliku dane w postaci `html`, gdzie każda linia pliku wczytanego będzie się znajdować w tagu `<p>`.
*/

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main05 {
    public static void main(String[] args) {
        String fileName = "text.txt";
        readFromFile(fileName);
    }

    private static void readFromFile(String fileName) {
        Path path = Paths.get(fileName);
        if (!Files.exists(path)) {
            System.out.println("Plik źródłowy nie istneje");
        }
        Path pathHtml = createHtmlFileFrom(path);
        try {
            writeToHtmlWithParagraph(path, pathHtml);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeToHtmlWithParagraph(Path path, Path pathHtml) throws IOException {
        List<String> listFromFile = new ArrayList<>();
        try {
            listFromFile = Files.readAllLines(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileWriter fileWriter = new FileWriter(String.valueOf(pathHtml))) {
            fileWriter.append("<html>"+"\n");
            for (String line : listFromFile
            ) {
                fileWriter.append("<p>" + line + "</p>"+"\n");
            }
            fileWriter.append("</html>");
        }
    }

    private static Path createHtmlFileFrom(Path path) {
        String filename = String.valueOf(path);
        filename = filename.replace(".txt", ".html");
        Path pathHtml = Paths.get(filename);
        if (!Files.exists(pathHtml)) {
            try {
                Files.createFile(pathHtml);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return pathHtml;
    }
}
