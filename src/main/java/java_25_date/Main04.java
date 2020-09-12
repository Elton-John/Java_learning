package java_25_date;

import java.time.*;
import java.time.chrono.IsoChronology;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

public class Main04 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate oldTime = LocalDate.of(1986, Month.SEPTEMBER, 20);
        Period period = Period.between(now, oldTime);

        long monthsBetween = ChronoUnit.MONTHS.between(now, oldTime);
        long daysBetween = ChronoUnit.DAYS.between(now, oldTime);
        long yearsBetween = ChronoUnit.YEARS.between(now, oldTime);

        System.out.println(String.format("months %s", monthsBetween));
        System.out.println(String.format("days %s", daysBetween));
        System.out.println(String.format("years %s", yearsBetween));
    }
}
