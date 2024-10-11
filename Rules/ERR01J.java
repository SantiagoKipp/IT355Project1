import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * ERR01J
 * Rule: Do not allow exceptions to expose sensitive information
 */
public class ERR01J {
    public static void main(String[] args) {
        SensitiveDataExample s = new SensitiveDataExample();
        s.riskyOperation(); // Demonstrate the risky operation
    }
}

/**
 * The SensitiveDataExample class represents a scenario where sensitive data or 
 * operations could be handled, and exceptions are managed securely.
 */
class SensitiveDataExample {

    // Logger instance for logging error messages
    private static final Logger logger = Logger.getLogger(SensitiveDataExample.class.getName());

    /**
     * This method represents a risky operation where exceptions might occur.
     * It safely logs the exceptions internally while providing the user with
     * generic, non-sensitive messages.
     */
    public void riskyOperation() {
        try {
            int x = 0;
            int y = 2;
            int c = y / x; // Risky division by zero
            System.out.println(c);
        } catch (ArithmeticException e) {
            // Log the exception internally without exposing sensitive information
            logger.log(Level.SEVERE, "An error occurred during a risky operation.", e);
            // Provide a generic message to the user
            System.out.println("An error occurred. Please try again later.");
        } catch (Exception e) {
            // Log unexpected exceptions
            logger.log(Level.SEVERE, "Unexpected error occurred.", e);
            // Provide a generic message for unexpected errors
            System.out.println("An unexpected error occurred. Please contact support.");
        }
    }
}
