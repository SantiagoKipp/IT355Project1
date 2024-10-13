import java.text.Normalizer;

/**
 * Demonstrates rule IDS01-J. Normalize strings before validating them (P12)
 * A class to validate if a user input, containing accented characters, is equivalent to a given valid input.
 */
public class AccentValidator {

    /**
     * Main method to run the accent validation.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // User input with letter 'e' and combining acute accent to produce 'é'
        String userInput = "e\u0301";

        // Normalize the user input before validation
        String normalizedInput = Normalizer.normalize(userInput, Normalizer.Form.NFKC);

        // Valid input containing the precomposed character 'é'
        String validInput = "é";

        // Validate the user input
        if (normalizedInput.equals(validInput)) {
            System.out.println("The user's input is valid.");
        } else {
            System.out.println("The user's input is invalid.");
        }
    }
}
