/**
 * The err07 class demonstrates error handling in Java by attempting to divide by zero
 * and catching the resulting ArithmeticException.
 */
public class err07 {

    /**
     * The main method calls the divide method with arguments that will cause an
     * ArithmeticException (division by zero). The exception is caught and handled
     * within a try-catch block.
     *
     */
    public static void main(String[] args) {
        try {
            // Attempting to divide by zero, which will throw an ArithmeticException
            divide(10, 0);
        } catch (ArithmeticException e) {
            // Catches the exception and prints a message to the console
            System.out.println("Trying to divide by 0");
        }
    }

    /**
     * A simple division method that takes two integers and returns the result of
     * dividing the first integer by the second. This method will throw an
     * ArithmeticException if the second integer (divisor) is zero.
     *
     * @param a The dividend.
     * @param b The divisor.
     * @return The result of the division (a / b).
     * @throws ArithmeticException if b is zero.
     */
    public static int divide(int a, int b) {
        return a / b;
    }
}
