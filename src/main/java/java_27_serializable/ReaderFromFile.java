package java_27_serializable;

import java.io.*;

public class ReaderFromFile {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person person1 = (Person) (ois.readObject());
            Person person2 = (Person) (ois.readObject());
            System.out.println(person1);
            System.out.println(person2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
