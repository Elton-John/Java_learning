package java_04_strings;

/*napisz program, /który dla znajdującej się w pliku zmiennej `str` wyświetli na konsoli odwrócony napis.
        Przykład: dla napisu `Tak` wyświetli `kaT`.*/

public class Main06 {
    public static void main(String[] args) {
        String str = "Tak";
        char[] tabOfLetters = str.toCharArray();
        String result = "";
        for (int i = tabOfLetters.length-1; i >=0; i--) {
            result = result.concat(String.valueOf(tabOfLetters[i]));
        }
        System.out.println(result);
    }
}
