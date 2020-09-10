package java_22_functionalInterface.task01;

import java.util.Arrays;
import java.util.List;

public class Main01 {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        IntegerFilter integerFilter = new IntegerFilter();
        printCheckList(myList, integerFilter);

        printCheckList(myList, new Filter<Integer>() {
            @Override
            public boolean check(Integer integer) {
                return integer > 3;
            }
        });

        printCheckList(myList, integer -> integer > 9);
    }

    static <T> void printCheckList(List<T> list, Filter<T> filter) {
        for (T listElement : list
        ) {
            if (filter.check(listElement)) {
                System.out.println(listElement);
            }

        }
    }
}
