package java_01_methods;

//napisz publiczną metodę checkMaturity, która:
//
//        przyjmie parametr liczbowy age oznaczający wiek użytkownika,
//        sprawdzi czy użytkownik jest pełnoletni,
//        zwróci wartość true – jeśli jest pełnoletni,
//        zwróci wartość false – jeśli nie jest.

public class Main06 {
    public static void main(String[] args) {
        System.out.println(checkMaturity(19));
    }

    private static boolean checkMaturity(int age) {
        if (age >= 18) {
            return true;
        }
        return false;
    }
}
