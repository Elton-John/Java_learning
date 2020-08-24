package java_13_collectionss;

//W pliku `Main02.java` napisz metodę
//        `public static void removeDivider (List<Integer> list, int divider)`,
//        która usunie z listy wszystkie elementy podzielne przez `divider`.


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        System.out.println(list);
        removeDivider(list, 2);
        System.out.println(list);
    }

    public static void removeDivider(List<Integer> list, int divider) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next()%divider==0){
                iterator.remove();
            }
        }
    }


}
