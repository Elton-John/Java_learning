package java_01_methods;

//
//napisz metodę public static int multiply(int multipler, int index), która zwróci wartość zmiennej
//        multipler pomnożonej przez wartość argumentu index.

public class Main01 {
    public static void main(String[] args) {
        int multiply = multiply(2, 3);
        System.out.println(multiply);
    }

    private static int multiply(int multipler, int index) {
        int result = multipler * index;
        return result;
    }
}
