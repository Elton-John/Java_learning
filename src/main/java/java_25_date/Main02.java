package java_25_date;
//Napisz metodę, która na ekranie wypisze dzień tygodnia,
//        w który przez kolejnych dziesięć lat będzie wypadała Wigilia.
//        Wykorzystaj LocalDate date = LocalDate.of(2019, Month.DECEMBER, 24);
//a następnie pobieraj odpowiednie dane w pętli.

import java.time.LocalDate;
import java.time.Month;

public class Main02 {
    public static void main(String[] args) {
        LocalDate date;
        for (int year = 2020; year <= 2030; year++) {
            date = LocalDate.of(year, Month.DECEMBER, 24);
            System.out.println(date.getDayOfWeek());
        }
    }
}
