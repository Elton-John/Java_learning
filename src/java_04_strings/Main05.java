package java_04_strings;

//została umieszczona metoda o sygnaturze `public static String stringFromArray(String[] str)`.
//        Uzupełnij ciało metody tak, aby zwracała napis powstały z połączenia wszystkich napisów występujących w tablicy `str`.

public class Main05 {
    public static void main(String[] args) {
        String[] str = {"tu", "taj", "jest"};
        stringFromArray(str);
    }

    private static String stringFromArray(String[] str) {
        String result = "";
        for (int i = 0; i < str.length; i++) {
            result = result.concat(str[i]);
        }
        System.out.println(result);
        return result;
    }
}
