package java_01_methods.java_01_methods;

//napisz publiczną metodę calculateNetto, która przyjmie argumenty:
//
//        gross: kwotę brutto ceny zakupu,
//        vat: wartość podatku VAT. Możesz założyć, że VAT ma być liczbą zmiennoprzecinkową z zakresu 0 – 1.
//        Metoda ma zwrócić wartość netto ceny. Napisz w komentarzu jakie obliczenia musisz wykonać.

public class Main05 {
    public static void main(String[] args) {
        calculateNetto(100.50, 0.23);
    }

    private static double calculateNetto(double brutto, double vat) {
        double result = brutto - (brutto*vat);
        System.out.println("cena netto to: " + result);
        return result;
    }
}
