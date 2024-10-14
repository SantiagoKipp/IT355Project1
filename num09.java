/**
*AN ARRAy class
 */
public class num09 {

    /**
     * The main method initializes an array and populates it with odd numbers
     * starting from 1, using a loop and no floating pt variables.
     */
    public static void main(String[] args) {
        int counter = 10; // The number of elements in the array
        int arr[] = new int[counter]; // Declares and initializes an array with a size of 'counter'

        /**
         * A for-loop iterates over each element in the array and assigns a value.
         */
        for (int i = 0; i <= counter - 1; i++) {
            arr[i] = 1 + i * 2; // Populates the array with the calculated value
        }
    }
}
