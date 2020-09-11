package java_23_lambda;

import java.util.Scanner;
import java.util.function.Predicate;

public class Main03 {
    public static void main(String[] args) {
        Predicate<String> isLetter = s -> s.matches("[a-zA-z]+");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("exit")) {
            if (isLetter.test(input)) {
                System.out.println(input + " is a letter");
            } else {
                System.out.println(input + " is not a letter");
            }
            input = scanner.nextLine();
        }
    }
}
