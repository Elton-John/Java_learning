package java_25_date;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//metoda ma zwracać mapę, gdzie kluczem jest nazwa strefy czasowej,
//        a wartością aktualna godzina w tej strefie. Wykorzystaj getAvailableZoneIds()
//        z klasy ZoneId oraz toMap klasy Collectors.
public class MapTime {

    public  Map<String, LocalTime> getMapTime() {
        return ZoneId.getAvailableZoneIds().stream()
                .collect(Collectors.toMap(Function.identity(),
                        s -> LocalTime.now(ZoneId.of(s))));
    }
}
