package java_28_exam;

import org.codehaus.plexus.component.annotations.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class HeroComponent {
    private List<Hero> heroes = new ArrayList<>();

    public List<Hero> getHeroes() {
        return heroes;
    }

    public void addHero(Hero hero){
        heroes.add(hero);
    }

    public Optional<Hero> findHeroByPhoneNumber(String phoneNumber){
        return getHeroes().stream().filter(hero -> hero.getPhoneNumber().equals(phoneNumber)).findFirst();
    }

}
