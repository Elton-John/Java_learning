package java_01_methods;

// umieść metodę o sygnaturze `public static double dogAge(double dogAge)` , która przeliczy wiek psa w psich latach.
//
//        * funkcja powinna przyjmować wiek psa jako parametr,
//        * dla pierwszych dwóch lat, każdy rok życia psa jest równy 10.5 ludzkiego roku,
//        * powyżej dwóch lat, każdy rok życia psa, to 4 ludzkie lata,
//        * funkcja powinna zwrócić wiek psa.

public class Home01 {
    public static void main(String[] args) {
        dogAge(10);
    }

    private static double dogAge(double age) {
        double result = 0;
        if (age<=2){
            result = age*10.5;
        } else {
            result = 21+(age-2)*4;
        }
        System.out.println("wiek psa: " + result);
        return result;
    }
}
