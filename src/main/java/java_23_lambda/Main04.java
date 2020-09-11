package java_23_lambda;

import java.util.function.Function;

public class Main04 {
    public static void main(String[] args) {
        Function<Double,String> squareOf = s -> String.valueOf(Math.sqrt(s));
        Function<Double,Double> powerOf = number -> Math.pow(number,2);

        System.out.println(squareOf.apply(4.0));
        System.out.println(powerOf.apply(2.0));
    }
}
