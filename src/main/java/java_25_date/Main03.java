package java_25_date;

import java.time.LocalTime;
import java.util.Map;

public class Main03 {
    public static void main(String[] args) {
        MapTime mapTime = new MapTime();
        Map<String, LocalTime> localTimeMap = mapTime.getMapTime();

        for (Map.Entry<String, LocalTime> entry : localTimeMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println(localTimeMap.get("Europe/Kiev"));
    }
}
