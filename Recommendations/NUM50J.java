package GroupProject1;

/**
 * The {@code NUM50J} class demonstrates a simple calculation involving
 * different data types in Java.
 * 
 * <p>
 * This class performs a modulus operation between an integer and a
 * short, casting the result to a double, and prints the result to the console.
 */
public class NUM50J {

    /**
     * The entry point of the application.
     * <p>
     * This method initializes two variables, performs a modulus operation,
     * and prints the result.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        int a = 4; // An integer value.
        short b = 7; // A short value.

        // Calculate the modulus of 'a' and 'b', cast the result to double.
        double c = (double) a % b;

        // Print the result of the modulus operation.
        System.out.println(c);
    }

}
