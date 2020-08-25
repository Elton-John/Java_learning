package java_13_collectionss;

//Napisz metodę public static Map<String, String> getMap(),
//        która utworzy 5 dowolnych zestawów przeciwieństw (
//                np. ciepło - zimno), doda je do mapy, a następnie zwróci.
//        W metodzie main programu, dla każdego klucza mapy,
//        pobieraj z konsoli odpowiedź użytkownika.
//        Program ma zadać 5 pytań.
//        Po udzieleniu ostatniej odpowiedzi -
//        ma wyświetlić wynik w postaci Poprawnych odpowiedzi: 3;




import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Map<String, String> map = getMap();
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String question = entry.getKey();
            String rightAnswer = entry.getValue();
            System.out.println(question);
            String answerFromUser = scanner.nextLine();
            if (answerFromUser.equals(rightAnswer)) {
                count++;
            }
        }
        System.out.println("Prawidłowych odpowiedzi: " + count);

    }

    private static Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        map.put("zimny", "gorący");
        map.put("biały", "czarny");
        map.put("kot", "pies");
        map.put("góra", "dół");
        return map;
    }
}
