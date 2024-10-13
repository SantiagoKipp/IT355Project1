import java.math.BigDecimal;

/**
 * Demonstrates rule NUM11-J. Do not compare or inspect the string representation of floating-point values
 * A class that demonstrates precise BigDecimal calculations by avoiding
 * direct floating-point division and comparing BigDecimal values.
 */
public class BigDecimalComparison {

    /**
     * Main method to perform a calculation with BigDecimal and compare the result.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        int myNum = 5;
        
        // Perform the calculation and convert to BigDecimal for exact precision
        BigDecimal result = new BigDecimal(Double.valueOf(myNum / 50000.0).toString());

        // Compare the result with the BigDecimal value of 0.0001
        if (result.compareTo(new BigDecimal("0.0001")) == 0) {
            System.out.println("The result is exactly 0.0001");
        } else {
            System.out.println("The result is not equal to 0.0001");
        }
    }
}
