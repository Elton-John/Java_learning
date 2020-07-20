package java_01_methods;

//W pliku Main04.java napisz publiczną metodę createName, która przyjmie następujące parametry:
//
//        name: imię,
//        surname: nazwisko,
//        nickname: pseudonim.

public class Main04 {
    public static void main(String[] args) {
        createName("Gosza", "Kucenko", "Gogi");
    }

    private static void createName(String name, String surname, String nickname) {
        System.out.println(name + " " + surname + " " + nickname);
    }
}
