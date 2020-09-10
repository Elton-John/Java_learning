package java_23_lambda;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Predicate<String> isDigit = o -> o.matches("\\d+");
        while (!line.equals("exit")) {
            if (isDigit.test(line)) {
                System.out.println(line + " is a number");
            } else {
                System.out.println(line + " is not a number");
            }
            line = scanner.nextLine();
        }
    }
}
