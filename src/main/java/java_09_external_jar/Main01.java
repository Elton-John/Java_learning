package java_09_external_jar;

import org.apache.commons.lang3.StringUtils;

/*apisz program, który dla znajdującej się w pliku zmiennej `str` wyświetli na konsoli odwrócony napis.
        Przykład: dla napisu `Tak` wyświetli `kaT`.*/

public class Main01 {
    public static void main(String[] args) {
        String str = "Tak";
        str = StringUtils.reverse(str);
        System.out.println(str);
    }
}
