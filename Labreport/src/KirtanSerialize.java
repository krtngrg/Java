package dupli;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;                    //serialization

class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters (optional)

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
    public class KirtanSerialize {
        public static void main(String[] args) {
            Person person = new Person("Kirtan", 18);

            try{
                FileOutputStream fileOutputStream = new FileOutputStream("person.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(person);
                System.out.println("Person object serialized successfully!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }