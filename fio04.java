import java.io.*;

/**
 * The fio04 class demonstrates basic file input/output operations in Java.
 * It reads the contents of a file line by line and prints each line to the console.
 */
public class fio04 {

    /**
     * The main method is the entry point of the program. It initializes a BufferedReader
     * to read from a specified file and then prints each line from the file to the console.
     * If an IOException occurs, it is caught and printed to the error stream.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String args[]) {
        String file = "filename.txt"; // Name of the file to read from
        BufferedReader reader = null;

        try {
            // Initialize the BufferedReader to read the file
            reader = new BufferedReader(new FileReader(file));
            String line;
            // Read each line of the file and print it to the console
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Print stack trace if an IOException occurs
            e.printStackTrace();
        } finally {
            // Close the BufferedReader to release resources
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
