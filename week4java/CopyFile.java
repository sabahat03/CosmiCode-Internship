//Task 3: Copy contents of one file into another

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("week4.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("week4copy.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error during file copy: " + e.getMessage());
        }
    }
}
