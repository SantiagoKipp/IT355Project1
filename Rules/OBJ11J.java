package GroupProject1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * The {@code OBJ11J} class provides functionality for reading and
 * processing the contents of a file line by line.
 * 
 * <p>
 * This class initializes a file scanner to read a specified file and
 * provides a method to process the file's content.
 */
public class OBJ11J {
    private File file; // The file to be read.
    private Scanner fileScanner; // Scanner for reading the file.

    /**
     * Constructs an {@code OBJ11J} object with the specified file path.
     * 
     * @param filePath The path of the file to be processed.
     * @throws FileNotFoundException If the file does not exist.
     */
    public OBJ11J(String filePath) throws FileNotFoundException {
        this.file = new File(filePath);

        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + filePath);
        }

        this.fileScanner = new Scanner(file);
    }

    /**
     * Processes the file by reading and printing its contents line by line.
     */
    public void processFile() {
        while (fileScanner.hasNextLine()) {
            System.out.println(fileScanner.nextLine());
        }
    }

    /**
     * The entry point of the application.
     * <p>
     * This method creates an instance of the {@code OBJ11J} class and
     * processes the specified file. If the file is not found, it catches
     * the {@code FileNotFoundException} and prints an error message.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        try {
            OBJ11J processor = new OBJ11J("non_existent_file.txt");
            processor.processFile();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
