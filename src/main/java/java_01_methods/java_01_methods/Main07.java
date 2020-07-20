package java_01_methods.java_01_methods;

//W pliku Main07.java napisz publiczną metodę checkEvenOdd, która:
//
//        przyjmie parametr liczbowy number,
//        będzie zwracać wartość typu String,
//        zwróci wynik "even", jeśli liczba jest parzysta,
//        zwróci wynik "odd", jeśli liczba jest nieparzysta.


public class Main07 {
    public static void main(String[] args) {
        System.out.println(checkEvenOdd(6));
    }

    public static String checkEvenOdd(int number) {
        String result;
        if (number % 2 == 0) {
            result = "even";
        } else {
            result = "odd";
        }
        return result;
    }
}
