package java_25_date;

import java.time.*;
import java.time.chrono.IsoChronology;
import java.time.temporal.ChronoUnit;
import java.util.stream.Stream;

public class Main04 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate dateOfBirthday = LocalDate.of(1986, Month.SEPTEMBER, 20);
        Period period = Period.between(now, dateOfBirthday);

        String name = "Olga";
        long monthsBetween = ChronoUnit.MONTHS.between(dateOfBirthday, now);
        long daysBetween = ChronoUnit.DAYS.between(dateOfBirthday, now);
        long yearsBetween = ChronoUnit.YEARS.between(dateOfBirthday, now);

        int currentYear = now.getYear();
        Month monthOfBirthday = dateOfBirthday.getMonth();
        int dayOfMonth = dateOfBirthday.getDayOfMonth();
        LocalDate nextBirthday = LocalDate.of(currentYear, monthOfBirthday, dayOfMonth);
        if (!nextBirthday.isAfter(now)){
            nextBirthday = nextBirthday.plusYears(1);
        }
        DayOfWeek dayOfWeekOfNextBirthday = nextBirthday.getDayOfWeek();
        long daysToNextBirthday = ChronoUnit.DAYS.between(now, nextBirthday);

        System.out.println(String.format("Hi %s, \n %s years \n or \n %s months \n or \n %s days \n have passed since your birthday." +
                        "\n Your next birthday will be in %s days.\n It will be %s.",
                name,
                yearsBetween,
                monthsBetween,
                daysBetween,
        daysToNextBirthday,
        dayOfWeekOfNextBirthday));


    }
}
