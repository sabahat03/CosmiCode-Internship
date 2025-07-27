// Task 1: Create a new text file and write a string into it

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("week4.txt");
            writer.write("Hello, this is a 4th week tasks of JAva Programming. ");
            writer.close();
            System.out.println("File created and text written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
