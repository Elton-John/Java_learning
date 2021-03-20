package java_00_revision;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringsManipulation {
    public static void main(String[] args) {
        Strings test = new Strings();
        // System.out.println(test.countOccurrencesOfLastLetter("java"));
        // System.out.println(test.countOccurrencesOfLastLetter("javag"));

        PangramChecker pc = new PangramChecker();
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        System.out.println(pc.check01(pangram1));
        System.out.println(pc.check02(pangram1));
        System.out.println(pc.checkPangram(pangram1));

        //System.out.println(pc.squareDigits(9119));
    }

}

class Strings {


    public int countOccurrencesOfLastLetter(String word) {
        char lastLetter = word.charAt(word.length() - 1);
        return countOccurrences(lastLetter, word);
    }

    private int countOccurrences(char x, String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == x) {
                count++;
            }
        }
        return count;
    }


//zamyka klasę
}

class PangramChecker {
    public boolean check01(String sentence) {
        //code

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        sentence = sentence.toLowerCase();
        char[] source = sentence.toCharArray();
        int count = 0;


        for (char letter : alphabet) {
            for (char l : source) {
                if (letter == l) {
                    count++;
                }

            }
            if (count == 0) {
                return false;
            }
            count = 0;
        }


        return true;
    }

    public boolean check02(String sentence) {
        return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
    }

    public boolean checkPangram(String sentence) {
        return sentence.chars()
                .map(Character::toLowerCase)
                .filter(Character::isAlphabetic)
                .distinct()
                .count() == 26;

    }

//    public int squareDigits(int n) {
//        StringBuilder builder = new StringBuilder();
//        // TODO Implement me
//
//        char[] chars = String.valueOf(n).toCharArray();
//        Arrays.stream(new char[][]{chars}).
//
//        String result = builder.toString();
//        return Integer.parseInt(result);
//    }

}