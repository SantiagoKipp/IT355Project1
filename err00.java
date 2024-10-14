import java.io.FileReader;
import java.io.IOException;

/**
 * This class demonstrates how to handle file reading with proper exception handling
 * and ensures that resources are closed properly.
 */
public class ReadFile {

    public static void main(String[] args) {
        String name = "xyz";
        FileReader file = null;

        try {
            // Try to read the file with the given name
            file = new FileReader(name);
        } catch (IOException e) {
            // Handle the case where the file is not found
            System.out.println("File Name is not found");
        } finally {
            // Ensure that the file is closed if it was successfully opened
            if (file != null) {
                try {
                    // Attempt to close the file and handle potential closing issues
                    file.close();
                } catch (IOException e) {
                    // Handle the case where the file cannot be closed
                    System.out.println("File cannot be closed");
                }
            }
        }
    }
}
