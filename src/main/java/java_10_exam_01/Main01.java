package java_10_exam_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        create(10);
    }

    private static void create(int max) {
        int iloscosob;
        iloscosob = getInt("Podaj ilość osób: ");
        System.out.println(iloscosob);
        for (int i = 0; i < iloscosob; i++) {
            try (FileWriter fileWriter = new FileWriter("exam.txt", true)) {
                fileWriter.append(getString("Podaj login: ") + " " + getInt("Podaj ocenę: ") + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        File file = new File("exam.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] line = scanner.nextLine().split(" ");
                if (Integer.parseInt(line[1]) > max * 0.6) {
                    try (FileWriter fileWriter = new FileWriter("exam_passed.txt", true)) {
                        fileWriter.append(line[0] + " " + line[1] + "\n");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static int getInt(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        int number;
        while (!scanner.hasNextInt()) {
            System.out.println("Podaj liczbę: ");
            scanner.next();
        }
        number = scanner.nextInt();
        return number;
    }

    static String getString(String message) {
        System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line;
    }
}
