package java_04_strings;


//W pliku `Main04.java` została umieszczona metoda o sygnaturze `public static boolean containsStr(String str, String search)`.
//        Uzupełnij ciało metody tak, aby zwracała informację czy zmienna `str` zawiera w sobie element napisu ze zmiennej `search`.

public class Main04 {
    public static void main(String[] args) {
        String str = "To mój dom";
        containsStr(str, "dom");
    }

    private static boolean containsStr(String str, String search) {
        boolean result = str.contains(search);
        System.out.println(result);
        return result;
    }
}
