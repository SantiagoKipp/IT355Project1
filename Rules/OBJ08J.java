package GroupProject1;

/**
 * The {@code OBJ08J} class demonstrates the use of inner classes in Java
 * to perform a simple addition operation.
 * 
 * <p>
 * This class contains a {@code MathOperation} class which has a nested
 * {@code Addition} class that computes and prints the sum of two numbers.
 */
public class OBJ08J {
    /**
     * The {@code MathOperation} class represents a mathematical operation
     * that includes two numbers and calculates their sum.
     */
    class MathOperation {
        private int number1 = 3; // First number.
        private int number2 = 4; // Second number.
        private int sum = number1 + number2; // The sum of number1 and number2.

        /**
         * The {@code Addition} class performs the addition operation and
         * provides a method to print the sum.
         */
        private class Addition {
            /**
             * Prints the sum of the two numbers to the console.
             */
            private void getSum() {
                System.out.println("Sum: " + sum);
            }
        }
    }

    /**
     * The entry point of the application.
     * <p>
     * This method creates instances of {@code MathOperation} and
     * {@code Addition}, and calls the method to display the sum.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        OBJ08J o = new OBJ08J();
        MathOperation math = o.new MathOperation();
        MathOperation.Addition add = math.new Addition();
        add.getSum();
    }
}
