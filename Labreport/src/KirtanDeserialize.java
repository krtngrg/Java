package dupli;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;           //deserialization

public class KirtanDeserialize  {

    public static void main(String[] args) {
        Person deserializedPerson;

        try{
            FileInputStream fileInputStream = new FileInputStream("person.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            deserializedPerson = (Person) objectInputStream.readObject();
            System.out.println("Deserialized Person object: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

