package java_04_strings;
//
//została umieszczona metoda o sygnaturze `public static int charPos(String str, char c) `.
//        Uzupełnij ciało metody tak, aby zwracała wartość pierwszego indeksu,
//        pod którym w napisie `str` znajduje się znak `c`.


public class Main02 {
    public static void main(String[] args) {
        String str = "hhhhaha";
        charPos(str, 'a');
    }

    private static int charPos(String str, char letter) {
        int index=0;
        char[] tabOfLetter = str.toCharArray();
        for (int i = 0; i < tabOfLetter.length; i++) {
            if (letter==tabOfLetter[i]){
                index = i;
                break;
            }
        }
        System.out.println(index);
        return index;
    }
}
