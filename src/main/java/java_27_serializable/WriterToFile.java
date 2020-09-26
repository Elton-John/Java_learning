package java_27_serializable;


import java.io.*;

public class WriterToFile {
    public static void main(String[] args) {
        Person person1 = new Person(5, "Elton", "John");
        Person person2 = new Person(2, "John", "Lennon");


        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(person1);
            oos.writeObject(person2);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
