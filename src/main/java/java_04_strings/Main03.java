package java_04_strings;

//została umieszczona metoda o sygnaturze `public static String firstHalf(String str)`.
//        Uzupełnij ciało metody tak, aby zwracała połowę napisu (uwzględniamy tylko część całkowitą podziału).
//        Przykład: dla napisu `CodersLab` zwróci `Code`.

public class Main03 {
    public static void main(String[] args) {
        String str = "Coderslab";
        firstHalf(str);
    }

    private static String firstHalf(String str) {
        int sizeOfHalf = str.length()/2;
        String half = str.substring(0,sizeOfHalf);
        System.out.println(half);
        return half;
    }
}
