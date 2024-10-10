package GroupProject1;

/**
 * The {@code EXP00J} class demonstrates how to concatenate two strings
 * representing a first name and a last name to form a full name.
 * 
 * <p>
 * This class includes a method that combines the two names and
 * prints the result.
 */
public class EXP00J {
    /**
     * The entry point of the application.
     * <p>
     * This method initializes the first and last names, combines them
     * using the {@code addStringsTogether} method, and prints the full name.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        String firstName = "Addison";
        String lastName = "Casner";
        String fullName;

        fullName = addStringsTogether(firstName, lastName);

        System.out.println(fullName);
    }

    /**
     * Concatenates the first name and last name into a single full name.
     *
     * @param firstName The first name to be added.
     * @param lastName  The last name to be added.
     * @return The concatenated full name as a single string.
     */
    public static String addStringsTogether(String firstName, String lastName) {
        return firstName + " " + lastName;
    }
}
