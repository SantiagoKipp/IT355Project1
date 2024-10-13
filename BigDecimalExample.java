import java.math.BigDecimal;

/**
 * Demonstrates rule NUM10-J. Do not construct BigDecimal objects from floating-point literals (P6)
 * A class that demonstrates the creation of a BigDecimal object using a string
 * to ensure exact representation and precision. Avoids using float or double
 * when constructing BigDecimal to prevent precision issues.
 */
public class BigDecimalExample {

    /**
     * Main method to create a BigDecimal object with precise representation.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a BigDecimal object from a string to ensure exact representation
        BigDecimal bd = new BigDecimal("0.5");

        // Display the BigDecimal value
        System.out.println("BigDecimal value: " + bd);
    }
}
