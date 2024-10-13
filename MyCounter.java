/**
 * Demonstrates recommendation DCL51-J. Do not shadow or obscure identifiers in subscopes
 * A class that represents a counter with a method to increment the count.
 * Demonstrates variable naming to avoid shadowing.
 */
public class MyCounter {

    private int count = 0;

    /**
     * Increments the count by a specified value, using a variable name
     * that avoids shadowing the instance variable 'count'.
     */
    private void incrementCount() {
        // Declare a new variable with a different name to avoid shadowing
        int incrementValue = 1; // Example increment logic
        count += incrementValue; // Logic for incrementing the count
    }

    /**
     * Main method to demonstrate the functionality of the MyCounter class.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        MyCounter counter = new MyCounter();
        counter.incrementCount();
        System.out.println("The count is: " + counter.count);
    }
}
