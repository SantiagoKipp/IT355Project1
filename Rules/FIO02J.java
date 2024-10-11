import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * FIO02J 
 * Rule: Detect and handle file-related errors
 */
public class FIO02J {

    /**
     * The main method serves as the entry point of the program.
     * It defines a file, checks if it exists, creates it if it doesn't,
     * and writes a message to it, handling any file-related exceptions.
     *
     * @param args Command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Define the file path
        File file = new File("example.txt");

        // Detect and handle file-related errors
        try {
            // Check if the file exists, and create it if necessary
            if (!file.exists() && !file.createNewFile()) {
                throw new IOException("Failed to create the file.");
            }

            // Use FileWriter to write to the file
            try (FileWriter writer = new FileWriter(file)) {
                writer.write("Efficient handling of file-related errors.");
            }

            System.out.println("File operations completed successfully.");

        } catch (IOException e) {
            // Handle file-related exceptions
            System.err.println("Error during file operations: " + e.getMessage());
        }
    }
}
