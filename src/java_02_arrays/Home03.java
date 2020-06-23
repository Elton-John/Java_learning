package java_02_arrays;

// umieść metodę o sygnaturze `public static boolean contains(int[] arr, int element)`.
//        1. Uzupełnij ciało metody w taki sposób by sprawdzała w czy tablicy  `arr` istnieje `element`.
//        2. Jeżeli tak ma zwracać `true`
//        3. Jeżeli nie ma zwracać `false`

public class Home03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 10};
        System.out.println(contains(arr, 5));
    }

    private static boolean contains(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                return true;
            }
        }
        return false;
    }
}
