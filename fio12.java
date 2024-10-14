import java.io.*;

/**
 * Demonstrates handling file-related errors by implementing FIO12.
 * This program attempts to read a file and provides error handling for file-related exceptions.
 */
public class fio12{

    /**
     * The main method tries to read a file and handles potential file-related exceptions
     * including FileNotFoundException and IOException.
     *
     */
    public static void main(String[] args) {
        String fileName = "example.txt"; // Name of the file to read

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            // Read and print each line from the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            // Handle the case where the file was not found
            System.err.println("Error: The file '" + fileName + "' was not found.");
        } catch (IOException e) {
            // Handle other I/O errors
            System.err.println("Error: An I/O error occurred while reading the file.");
        }
    }
}
