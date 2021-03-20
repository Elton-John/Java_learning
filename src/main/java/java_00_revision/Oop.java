package java_00_revision;

import java.util.*;

public class Oop {

    public static void main(String[] args) {

        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleSet = new TreeSet<>();


        addElements(peopleList);
        addElements(peopleSet);

       // Collections.sort(peopleList);

        peopleList.sort((o1,o2) -> {
            if(o1.getName().length() > o2.getName().length()){
                return 1;
            } else if (o2.getName().length() > o1.getName().length()){
                return -1;
            } else {
                return 0;
            }
        });



       // System.out.println(peopleList);
    //    System.out.println(peopleSet);

        Calculator calculator = new Calculator();
        double divide = calculator.divide(5.0, 2);
        double divide2 = calculator.divide(15.0, 2);

        calculator.add(5,5);
        calculator.printAllOperations();
        calculator.cleanOperations();
        calculator.multiply(2,2);
        calculator.printAllOperations();



        Person user = new User(1, "Sasha", "Alex");
        Person person = new Person(2, "Masha");
        Person.staticMethod();
        User.staticMethod();


        AdvancedCalculator advCalculator = new AdvancedCalculator();
        advCalculator.add(2,5);
        advCalculator.pow(2,2);
        advCalculator.printAllOperations();

//zamyka main
    }

    private static void addElements(Collection collection) {
        collection.add(new Person(1, "Dima"));
        collection.add(new Person(3, "Ant"));
        collection.add(new Person(2, "Ilona"));

    }


//zamyka klasę Oop
}

class Person implements Comparable<Person> {

    private Integer id;
    private String name;

    public Person(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

//        public boolean equals(Object o){
////////
//        }

//        public int hashCode(){
///////
//        }

    @Override
    public int compareTo(Person o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id < o.id) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void staticMethod (){
        System.out.println("ooo!");
    }

//zamyka klasę Person
}




