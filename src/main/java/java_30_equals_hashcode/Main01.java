package java_30_equals_hashcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main01 {
    public static void main(String[] args) {
        Map<Integer, Dog> map = new HashMap<>();
        Set<Dog> set = new HashSet<>();

        Dog dog1 = new Dog(1,"Charly");
        Dog dog2 = new Dog(1,"Peddy");

        map.put(dog1.id, dog1);
        map.put(dog2.id, dog2);

        set.add(dog1);
        set.add(dog2);

        System.out.println(map);
        System.out.println(set);
    }

}

class Dog{
    Integer id;
    String name;

    public Dog(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (id != null ? !id.equals(dog.id) : dog.id != null) return false;
        return name != null ? name.equals(dog.name) : dog.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
