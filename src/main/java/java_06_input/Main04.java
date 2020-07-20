package java_06_input;

/*stwórz metodę o sygnaturze `public static void rowsColumns()`, która:

1. wczyta z konsoli 2 liczby całkowite i przypisze je do zmiennych `rows` i `columns`,
2. stworzy tablicę o podanej liczbie wierszy i kolumn,
3. wypełni tablicę kolejnymi liczbami całkowitymi,
4. obliczy i wyświetli na konsoli sumę wszystkich elementów,
5. obliczy i wyświetli na konsoli średnią wszystkich elementów.
Wywołaj metodę w metodzie `main`.*/

import java.util.Arrays;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        rowsColumns();
    }

    private static void rowsColumns() {
        int numberOfRows;
        int numberOfColumns;
        int input;
        int sum = 0;
        int avg = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę wierszy: ");
        numberOfRows = getInt(scanner);
        System.out.print("Podaj liczbę column: ");
        numberOfColumns = getInt(scanner);
        int[][] matrix = new int[numberOfColumns][numberOfRows];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Podaj wartość pola: ");
                input = getInt(scanner);
                matrix[i][j] = input;
                sum = sum + matrix[i][j];
            }
        }
        try {
            avg = sum / (numberOfColumns * numberOfRows);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        }

        System.out.println(Arrays.deepToString(matrix));
        System.out.println("Suma wszystkich wartości: " + sum);
        System.out.println("Średnia: " + avg);

    }

    private static int getInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("podaj liczbę: ");
        }
        return scanner.nextInt();
    }
}
