package problem_solving;

import java.util.ArrayList;
import java.util.List;

public class Problems_01_10 {
    public static void main(String[] args) {
        //  System.out.println(sumOfMultiplesOf3Or5Before(1000));
        System.out.println(sumOfEvenTermOfFibonacciSequenceBeforeFourMillions());

    }

    public static int sumOfMultiplesOf3Or5Before(int naturalNumber) {
        int sum = 0;
        for (int i = 0; i < naturalNumber; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static long sumOfEvenTermOfFibonacciSequenceBeforeFourMillions() {
        long sum = 0;
        List<Long> fibonacciSequence = getFibonacciSequenceUntil(4000000);
        for (long n : fibonacciSequence) {
            if (n % 2 == 0) {
                sum = sum + n;
            }
        }
        return sum;
    }

    public static List<Long> getFibonacciSequenceUntil(long maxNumber) {
        List<Long> fibonacciSequence = new ArrayList<>();
        int i = 1;
        long fibNum = getFibNum(i);
        while (fibNum <= maxNumber) {
            fibonacciSequence.add(fibNum);
            i++;
            fibNum = getFibNum(i);
        }

        return fibonacciSequence;
    }

    public static long getFibNum(int n) {
        long[] mem = new long[n + 1];
        mem[0] = 0;
        mem[1] = 1;

        for (int i = 2; i <= n; i++) {
            mem[i] = mem[i - 1] + mem[i - 2];

        }

        return mem[n];
    }
}
