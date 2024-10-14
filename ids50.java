import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ids50 {

    /**
     * The main method checks if a file name is provided as a command-line argument and validates it.
     * It prints an error message if no file name is provided.
     *
     */
    public static void main(String[] args) {
        // Check if a file name was provided as an argument
        if (args.length < 1) {
            System.out.println("You did not input a file name");
            return;
        }

        String name = args[0]; // Store the provided file name
        // Define a regex pattern that matches any character not allowed in the file name
        Pattern pattern = Pattern.compile("[^A-Za-z0-9._]");
        Matcher matcher = pattern.matcher(name);

        // If the file name contains any invalid characters, print an error message and exit
        if (matcher.find()) {
            System.out.println("You have an error with your file name");
            return;
        }

        // Create a File object with the validated file name
        File file = new File(name);
    }
}
