package java_06_input;
/*
stwórz metodę o sygnaturze `public static void textLines()`, która wczyta kolejne linie tekstu z konsoli,
        a następnie je wyświetli. Program ma zakończyć działanie po wpisaniu `quit` (ale już bez wyświetlania go na konsoli).
        Wywołaj metodę w metodzie `main`.*/

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        textLines();
    }

    private static void textLines() {
        String line;
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.print("wprowadź linię: ");
        line = scanner.nextLine();
        while (!line.equals("quit")){
            stringBuilder.append(line);
            System.out.println("wprowadź linię");
            line=scanner.nextLine();
        }
        System.out.println(stringBuilder);
    }
}
