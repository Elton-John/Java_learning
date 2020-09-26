package java_28_exam;

import java.util.Set;
import java.util.TreeSet;

public class Main01 {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        Hero hero2 = new Hero();
        Hero hero3 = new Hero();
        hero1.setPower(3L);
        hero2.setPower(2L);
        hero3.setPower(1L);

        Set<Hero> heroSet = new TreeSet<>();
        heroSet.add(hero1);
        heroSet.add(hero2);
        heroSet.add(hero3);
        System.out.println(heroSet);
    }
}
