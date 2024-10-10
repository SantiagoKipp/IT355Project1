package GroupProject1;

/**
 * The {@code DCL01J} class demonstrates the use of an inner class to
 * create a custom thread with a unique ID.
 * 
 * <p>
 * This class includes a {@code main} method which instantiates and starts
 * a custom thread.
 */
public class DCL01J {

    /**
     * The {@code CustomThread} class represents a thread with a unique ID.
     * <p>
     * This class includes a method to start the thread and print its ID.
     */
    public class CustomThread {
        /** The ID of the custom thread. */
        private int id;

        /**
         * Constructs a {@code CustomThread} object with a specified ID.
         *
         * @param id The unique ID for the thread.
         */
        public CustomThread(int id) {
            this.id = id;
        }

        /**
         * Starts the thread and prints the thread ID to the console.
         */
        public void start() {
            System.out.println("Custom Thread started with ID: " + id);
        }

    }

    /**
     * The entry point of the application.
     * <p>
     * This method creates and starts a custom thread.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        DCL01J d = new DCL01J();
        CustomThread myThread = d.new CustomThread(1);
        myThread.start();
    }

}
