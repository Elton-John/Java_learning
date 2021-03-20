package java_00_revision;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRevision {


    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "jeden");
        map.put(2, "dwa");
        map.put(3, "trzy");

        String s = map.get(1);
        System.out.println(s);
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


//zamyka mian
    }
}
