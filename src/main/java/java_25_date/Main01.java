package java_25_date;

//Napisz program, który wypisze na standardowym wyjściu aktualną godzinę
//        we wszystkich europejskich strefach czasowych Wykorzystaj getAvailableZoneIds()
//        z klasy ZoneId - filtruj sprawdzając czy strefa czasowa zawiera słowo Europe.

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class Main01 {
    public static void main(String[] args) {
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        availableZoneIds.forEach(zone -> {
            if (zone.contains("Europe")){
                System.out.println(zone);
                System.out.println(LocalTime.now(ZoneId.of(zone)));
            }
        });
    }
}
