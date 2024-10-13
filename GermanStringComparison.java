import java.text.Collator;
import java.util.Locale;

/**
 * Demonstrates rule STR02-J. Specify an appropriate locale when comparing locale-dependent data (P8)
 * A class that demonstrates comparing two strings in the German locale,
 * treating "ß" and "ss" as equivalent when using locale-sensitive comparison.
 */
public class GermanStringComparison {

    /**
     * Main method to compare two German words using locale-specific rules and Collator.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // German word for "street"
        String str1 = "straße";

        // Alternate, correct spelling of the same word
        String str2 = "strasse";

        // Create a Collator for the German locale
        Collator collator = Collator.getInstance(Locale.GERMANY);
        collator.setStrength(Collator.PRIMARY); // PRIMARY strength ignores case and accents

        // Compare the two strings using the Collator
        int result = collator.compare(str1, str2);

        if (result == 0) {
            System.out.println("The two strings are equivalent in the German locale.");
        } else {
            System.out.println("The two strings are not equivalent in the German locale.");
        }
    }
}
