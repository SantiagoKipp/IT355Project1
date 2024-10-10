package GroupProject1;

/**
 * The {@code OBJ01J} class demonstrates a simple program that prints
 * an age value.
 * 
 * <p>
 * This class includes a method to return the age and a main method
 * that displays the age on the console.
 */
public class OBJ01J {
    /** The age of the individual. */
    private static int age = 20;

    /**
     * The entry point of the application.
     * <p>
     * This method prints the age by calling the {@code printAge} method.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {

        System.out.println(printAge(age));
    }

    /**
     * Returns the age passed to it as a parameter.
     *
     * @param age The age to be returned.
     * @return The value of the age.
     */
    public static int printAge(int age) {
        return age;
    }
}
