package java_04_strings;
//napisz program, który:
//
//        1. pobierze przedostatnią literę zmiennej `str`, znajdującej się w pliku,
//        2. wyświetli na konsoli liczbę wystąpień tej litery w całym ciągu znaków.

public class Main01 {
    public static void main(String[] args) {
        String str = "CodersLab jak dobrze zacząć programować";
        int strLength = str.length();
        char letter = str.charAt(strLength-2);
        System.out.println(letter);
        char[] tabOfLetters = str.toCharArray();
        int iloscWystapien = 0;
        for (int i = 0; i < tabOfLetters.length; i++) {
            if (letter==tabOfLetters[i]){
                iloscWystapien++;
            }
        }
        System.out.println(iloscWystapien);
    }
}
