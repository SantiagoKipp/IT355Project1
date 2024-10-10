package GroupProject1;

/**
 * The {@code OBJ05J} class demonstrates the use of an array and
 * encapsulation in Java.
 * 
 * <p>
 * This class provides access to an internal array through a getter method
 * that returns a cloned copy of the array to prevent direct modification.
 */
public class OBJ05J {
    /** An array of integers. */
    private int[] numberArray = { 1, 2, 3, 4 };

    /**
     * Returns a clone of the internal number array.
     * 
     * @return A cloned array of integers, preventing modification of the
     *         original array.
     */
    public int[] getNumberArray() {
        return numberArray.clone();
    }

    /**
     * The entry point of the application.
     * <p>
     * This method creates an instance of the {@code OBJ05J} class,
     * retrieves a copy of the number array, modifies the copy, and then
     * prints the first element of the original array to demonstrate that it
     * remains unchanged.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        OBJ05J o = new OBJ05J();
        int[] anotherNumArray = o.getNumberArray();

        anotherNumArray[0] = 5; // Modifying the cloned array.

        int[] newArray = o.getNumberArray(); // Retrieving the original array.
        System.out.println(newArray[0]); // Printing the first element of the original array.
    }
}
