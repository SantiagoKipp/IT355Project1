import java.io.File;

/**
 * ENV02J 
 * rule: Do not trust the values of environment variables
 */
public class ENV02J {

    /**
     * The main method where the program execution begins.
     * It retrieves the "CONFIG_FILE_PATH" environment variable, checks if it's valid,
     * and falls back to a default path if the variable is missing or incorrect.
     *
     * @param args Command-line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Fetch the environment variable
        String configFilePath = "Incorrect path/here/there";


        // Validate the environment variable
        if (configFilePath == null || configFilePath.isEmpty() || !new File(configFilePath).isFile()) {
            System.err.println("Invalid CONFIG_FILE_PATH. Using default configuration.");
            configFilePath = "default path";  // Fallback path

        }

        // Print the configuration file path being used
        System.out.println("Loading configuration from: " + configFilePath);

        // Proceed with loading configuration
    }
}



