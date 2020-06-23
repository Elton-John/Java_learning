package java_01_methods;

//W pliku Main02.java napisz metodę public static int square(int num), która zwróci wartość num podniesioną do kwadratu.

public class Main02 {
    public static void main(String[] args) {
        int square = square(5);
        System.out.println(square);
    }

    private static int square(int num) {
        int result = num*num;
        return result;
    }
}
