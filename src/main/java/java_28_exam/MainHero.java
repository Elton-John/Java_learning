package java_28_exam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainHero {
    public static void main(String[] args) {
        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Hero("batman", 5L, LocalDate.of(2001, 12, 11)));
        heroes.add(new Hero("superman", 19L, LocalDate.of(2001, 12, 11)));
        heroes.add(new Hero("spiderman", 6L, LocalDate.of(2001, 12, 11)));
        heroes.add(new Hero("swamp Thing", 4L, LocalDate.of(2001, 12, 11)));
        heroes.add(new Hero("hubertman", null, LocalDate.of(2001, 12, 11)));
        heroes.add(new Hero("nuperman", 12L, LocalDate.of(2001, 12, 11)));
        heroes.add(new Hero("n", null, LocalDate.of(2001, 12, 11)));


        String collect = heroes.stream()
                .filter(hero -> hero.getName().length() >= 2)
                .filter(hero -> hero.getName().charAt(1) == 'u')
                .filter(hero -> Optional.ofNullable(hero.getPower()).orElseGet(() -> -1L) > 5)
                .sorted()
                .map(Hero::getName)
                .map(s -> s.toUpperCase().charAt(0))
                .map(Object::toString)
                .collect(Collectors.joining(" - "));

        System.out.println(collect);


//        wybierz tylko tych bohaterów, których druga litera nazwy to u oraz ich moc jest większa od 5,
//            (nie zapomnij o sprawdzeniu czy nazwa ma minimum 2 znaki oraz czy moc nie jest równa null)
//        sortuj bohaterów pod względem mocy (domyślnie zostanie wykorzystana utworzona metoda z interfejsu),
//                przekształć obiekty pobierając tylko ich nazwy,
//                przekształć nazwy, zostawiając z nich tylko pierwszą literę oraz zamieniaj litery na wielkie,
//        zwróć przekształcone nazwy, połączone za pomocą znaku myślnika - w postaci jednego obiektu typu String.
//                Wszystkie operacje wykonaj na jednym strumieniu. Przykładowy wynik:
//


    }
}
