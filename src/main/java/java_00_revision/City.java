package java_00_revision;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class City {
    private String name;
    private int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public static List<City> initialize() {
        List<City> cities = new ArrayList<>();
        cities.add(new City("Wrocław", 500000));
        cities.add(new City("Kraków", 500000));
        cities.add(new City("Warszawa", 500000));


        return cities;
    }

    public static List<City> firstSublist(List<City> list, int startIndex, int endIndex) {
        List<City> sublist = new ArrayList<>();
        for (int i = startIndex; i < endIndex; i++) {
            sublist.add(list.get(i));
        }

        return sublist;
    }

    public static List<City> secondSublist(List<City> list, int startIndex, int endIndex) {
        return list.subList(startIndex, endIndex);
    }

    public static List<City> reverse(List<City> list) {
        List<City> reverseList = new ArrayList<>();
        ListIterator<City> it = list.listIterator();
        while (it.hasNext()) {
            it.next();
        }

        while (it.hasPrevious()) {
            reverseList.add(it.previous());
        }
        return reverseList;
    }


    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    //zamyka klasę
}
