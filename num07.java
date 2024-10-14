/**
 * The num07 class demonstrates the correct way to check if a float value is NaN
 * using the Float.isNaN method, which is safer than using equality comparison.
 */
public class num07 {

    /**
     * The main method creates a NaN float value and checks if it is NaN using Float.isNaN.
     * This prevents potential issues with direct equality comparison, which may lead to
     * unforeseen behavior when dealing with NaN values.
     *
     */
    public static void main(String[] args) {
        float notANumber = Float.NaN; // Initialize a float value as NaN

        // Use Float.isNaN to check if the value is NaN
        if (Float.isNaN(notANumber)) {
            System.out.println("This is not a number");
        } else {
            System.out.println("This is a number!");
        }
    }
}
