package GroupProject1;

/**
 * The {@code OBJ54J} class demonstrates the creation and initialization
 * of an integer array in Java.
 * 
 * <p>
 * This class initializes an array of integers with a size of 10,
 * fills it with sequential values, and prints those values to the console.
 */
public class OBJ54J {

    /**
     * The entry point of the application.
     * <p>
     * This method creates an integer array, populates it with values from
     * 0 to 9, and prints each value to the console.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        int[] array = new int[10]; // Create an integer array of size 10.

        // Populate the array with values and print them.
        for (int i = 0; i < array.length; i++) {
            array[i] = i; // Assign the value of the index to the array element.
            System.out.print(array[i] + " "); // Print the current value.
        }

    }

}
