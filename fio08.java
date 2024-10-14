import java.io.FileInputStream;
import java.io.IOException;

/**
 * This class demonstrates how to properly read a file using FileInputStream
 * and handle any potential I/O exceptions.
 */
public class FileStreamExample {

    /**
     * Method to read from a file byte by byte until the end of the file is reached.
     * It converts the read bytes into characters and prints them to the console.
     */
    public void read() {
        try {
            // FileInputStream to read from the file "example.txt"
            FileInputStream fis = new FileInputStream("example.txt");
            int data = 0;

            // Read bytes until the end of the file (denoted by -1)
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);  // Convert byte to character and print
            }

            // Close the input stream after use
            fis.close();
        } catch (IOException e) {
            // Handle any IOException that occurs during file read operation
            System.out.println("Cannot read the file");
        }
    }

    public static void main(String[] args) {
        // Create an instance of FileStreamExample and call the read method
        FileStreamExample example = new FileStreamExample();
        example.read();
    }
}
