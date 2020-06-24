package java_07_fileio;

/*
1. wczyta zawartość z załączonego pliku text5.txt,
        2. posortuje znajdujące się tam nazwy języków programowania i zapisze wynik.
        Lista języków pobrana z rankingu: http://www.tiobe.com/tiobe-index/.
// Zgadnij jaki język jest na samej górze..?*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        File file = new File("text5.txt");
        String[] strArray = new String[0];
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNextLine()){
                strArray = Arrays.copyOf(strArray,strArray.length+1);
                strArray[strArray.length-1] = scanner.nextLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Arrays.sort(strArray);
        System.out.println(strArray[0]);
    }
}
