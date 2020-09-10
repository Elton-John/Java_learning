package java_23_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Character userChar = scanner.nextLine().charAt(0);
        while (!userChar.equals('e')) {
            list.add(userChar);
            userChar = scanner.nextLine().charAt(0);
        }
        System.out.println(list);
        list.sort(Character::compareTo);
        System.out.println(list);

    }
}
