package java_22_functionalInterface.task02;

import java_22_functionalInterface.task01.Filter;

import java.util.Arrays;
import java.util.List;

import static java.lang.String.valueOf;

public class Main02 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        printList(list, new Filter<Integer>() {
            @Override
            public boolean check(Integer integer) {
                return integer % 2 == 0;
            }
        }, new Transform<String, Integer>() {
            @Override
            public String transform(Integer integer) {
                String result = valueOf(integer) + " was transformed";
                return result;
            }
        });

        printList(list, integer -> integer % 2 == 0, integer -> valueOf(integer + 1) + " was transformed twice");

    }

    static <T, S> void printList(List<S> list, Filter<S> filter, Transform<T, S> transform) {
        for (S listElement :
                list) {
            if (filter.check(listElement)) {
                T transformated = transform.transform(listElement);
                System.out.println(transformated);
            }
        }
    }
}