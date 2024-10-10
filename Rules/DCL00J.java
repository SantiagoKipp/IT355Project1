package GroupProject1;

/**
 * The {@code DCL00J} class demonstrates the use of static final fields and
 * a basic constructor that sums two numbers.
 * 
 * 
 * This class includes a main method which prints the sum of two numbers.
 */

public class DCL00J {
    /** The sum of the two static numbers */
    private final int sum;

    /** A static final field representing the first number */
    private static final int number1 = 5;

    /** A static final field representing the second number. */
    private static final int number2 = 5;

    /**
     * A static instance of the {@code DCL00J} class.
     * <p>
     * This instance is used to access the sum in the {@code main} method.
     */
    private static final DCL00J dcl = new DCL00J();

    /**
     * Constructs a {@code DCL00J} object and initializes the {@code sum}
     * by adding {@code number1} and {@code number2}.
     */
    public DCL00J() {
        sum = number1 + number2;
    }

    /**
     * The entry point of the application.
     * <p>
     * This method prints the sum of two static numbers to the console.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        System.out.println("The sum of two random numbers is " + dcl.sum);
    }
}
