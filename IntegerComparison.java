/**
 * Demonstrates rule EXP03-J. Do not use equality operators when comparing values of boxed primitives (P6)
 * A class that demonstrates the use of the equals() method for comparing Integer objects
 * instead of using the equality operators (== or !=).
 */
public class IntegerComparison {

    /**
     * Main method to compare two Integer objects using the equals() method.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Integer myNum1 = 1000;
        Integer myNum2 = 1000;

        // Use the equals() method instead of the equality operators (== or !=)
        if (myNum1.equals(myNum2)) {
            System.out.println("My first integer is equal to my second integer.");
        } else {
            System.out.println("My first integer is not equal to my second integer.");
        }
    }
}
