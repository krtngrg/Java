package dupli;

import java.io.FileWriter;
import java.io.IOException;

public class KirtanHelloFile {

    public static void main(String[] args) {
        String data = "Hello BCA";
        String filename = "data.txt";

        try {
            FileWriter writer = new FileWriter(filename);
            writer.write(data);
            writer.close();

            System.out.println("String written to file successfully!");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
