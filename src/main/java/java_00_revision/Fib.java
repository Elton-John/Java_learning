package java_00_revision;

import java.util.Arrays;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Fib {

    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n + 1];
        Arrays.fill(mem, -1);

        //  System.out.println(fibonacci(n, mem));

        //   System.out.println(getGreaterNumberByConcat(Arrays.asList(2, 5, 1, 9)));
        int[] digits = {2, 5, 9, 0};
        // System.out.println(getGreaterNumberFromDigits(digits));
        int[] ints = myBSort(digits);
        System.out.println(Arrays.toString(ints));

//zamyka main
    }


    public static long fibonacci(int x, long[] mem) {
        if (mem[x] != -1) {
            return mem[x];
        }

        if (x <= 1) {
            return x;
        }

        long result = fibonacci(x - 1, mem) + fibonacci(x - 2, mem);
        mem[x] = result;

        return result;
    }

    public static int getGreaterNumberByConcat(List<Integer> numbers) {
        String resultAsString = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .reduce("", (prev, next) -> prev + next);
        return Integer.parseInt(resultAsString);
    }

    public static int getGreaterByConcat(List<Integer> numbers) {
        StringBuilder builder = new StringBuilder();
        while (numbers.size() != 0) {
            Optional<Integer> max = numbers.stream().max(Integer::compareTo);
            builder.append(max);

            numbers.remove((max.get()));
        }

        return Integer.parseInt(builder.toString());
    }

    public static String getGreaterNumberFromDigits(int[] digits) {
        return Arrays.stream(digits).boxed().sorted(Comparator.reverseOrder())
                .map(String::valueOf)
                .reduce("", String::concat);
    }

    public static int[] bSort(int[] mas) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buf;
                }
            }
        }
        return mas;
    }


    public static int[] myBSort(int[] given) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < given.length - 1; i++) {
                if (given[i] > given[i + 1]) {
                    isSorted = false;

                    int buff = given[i];
                    given[i] = given[i + 1];
                    given[i + 1] = buff;
                }
            }
        }
        return given;
    }

//zamyka Fib
}
