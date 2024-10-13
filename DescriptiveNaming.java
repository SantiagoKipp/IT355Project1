/**
 * Demonstrates recommendation DCL50-J. Use visually distinct identifiers
 * A class that demonstrates the importance of using descriptive variable names
 * to avoid visual confusion, especially between characters like 'l' and 'I'.
 */
public class DescriptiveNaming {

    /**
     * Main method that uses descriptive variable names to enhance code readability.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        int length = 10;
        int index = 20;

        // This is clear, no room for visual confusion
        if (length == 10) {
            System.out.println("The length is 10.");
        }
    }
}
