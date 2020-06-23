package java_01_methods;

//W pliku Main03.java napisz publiczną metodę convertToUsd,
// która przyjmuje parametr pln, czyli kwotę w złotówkach. Metoda ma zwrócić podaną kwotę w dolarach amerykańskich.
// Jako przelicznik przyjmij wartość 4.04 PLN = 1 USD.

public class Main03 {
    public static void main(String[] args) {
        double usd = convertToUsd(2.5);
        System.out.println(usd);
    }

    private static double convertToUsd(double pln) {
        double result = pln/4.04;
        return result;
    }
}
