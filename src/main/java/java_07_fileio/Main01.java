package java_07_fileio;

//
//W pliku `Main01.java` napisz program, który będzie wczytywał kolejne linie tekstu z konsoli,
//        a następnie zapisywał je do pliku o nazwie `text1.txt`.
//        Program ma zakończyć działanie po wpisaniu słowa `quit` (bez zapisywania go do pliku `Main1.txt`).


import java.io.*;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder stringBuilder = new StringBuilder();
        String input;
        input = scanner.nextLine();
        while (!input.equals("quit")) {
            stringBuilder.append(input + "\n");
            input = scanner.nextLine();
        }
        //saveAsFile("text.txt", stringBuilder);
        saveWithPrintWriter("text.txt", stringBuilder);
    }

    private static void saveWithPrintWriter(String fileName, StringBuilder stringBuilder) {
        try (PrintWriter printWriter = new PrintWriter(fileName)) {
            printWriter.println(stringBuilder);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void saveAsFile(String fileName, StringBuilder stringBuilder) {
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(fileName, true)) {
            fileWriter.append(stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
