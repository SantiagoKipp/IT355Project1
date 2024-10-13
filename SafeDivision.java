/**
 * Demonstrates rule NUM02-J. Ensure that division and remainder operations do not result in divide-by-zero errors (P6)
 * A class that demonstrates safe division by checking for a divide-by-zero error.
 */
public class SafeDivision {

    /**
     * Main method to perform safe division by checking if the divisor is zero.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        int myNum1 = 10;
        int myNum2 = 0;

        // Check if the divisor is not zero before performing division
        if (myNum2 != 0) {
            // Safe division
            int result = myNum1 / myNum2; // Would work the same way for the modulus (%) operator
            System.out.println("The result of division is: " + result);
        } else {
            // Handle divide-by-zero error
            System.out.println("Cannot divide by zero.");
        }
    }
}
