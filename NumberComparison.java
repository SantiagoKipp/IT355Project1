/**
 * Demonstrates recommendation EXP51-J. Do not perform assignments in conditional expressions
 * A class that demonstrates correct comparison of an integer variable with a constant.
 */
public class NumberComparison {

    /**
     * Main method that compares an integer variable with a specified value.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        int myNum = 7;

        // This correctly compares myNum with 7
        if (myNum == 7) {
            System.out.println("My number is 7.");
        }
    }
}
