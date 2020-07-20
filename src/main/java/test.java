import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        File file = new File("text.txt");
        Scanner scan = null;
        double sum = 0.0;
        String[] arr;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (true) {
            assert scan != null;
            if (!scan.hasNextLine()) break;
            String line;
            line = scan.nextLine();
            arr = line.split(",");
            for (String s : arr) {
                try {
                    sum += Double.parseDouble(s);
                } catch (NumberFormatException ignored) {
                }
            }
        }

        System.out.println("Suma elementów liczbowych: "+sum);
    }

}