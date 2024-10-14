
public class tsm00 {
    private int counter; // A private integer variable to store the counter value

    /**
     * Increments the counter by one. 
     */
    public synchronized void increment() {
        counter++;
    }

    /**
     * Decrements the counter by one. 
     */
    public synchronized void decrement() {
        counter--;
    }

    /**
     * Returns the current value of the counter.
     *
     * @return The current value of the counter.
     */
    public synchronized int getCounter() {
        return counter;
    }
}
