package GroupProject1;

/**
 * The {@code MET05J} class demonstrates the use of inner classes and method
 * overriding in Java.
 * 
 * <p>
 * This class includes an inner class {@code InnerMET05J} that
 * extends the outer class and overrides a method to provide specific behavior.
 */
public class MET05J {
    /**
     * Constructs a {@code MET05J} object and initializes it by calling
     * the {@code initialize} method.
     */
    public MET05J() {
        initialize();
    }

    /**
     * Initializes the object by invoking the {@code printSomething} method.
     */
    private void initialize() {
        printSomething();
    }

    /**
     * Prints a message indicating that this is the base class.
     */
    public void printSomething() {
        System.out.println("This is the Base class.");
    }

    /**
     * The inner class {@code InnerMET05J} extends the {@code MET05J} class
     * and provides a specific implementation of the {@code printSomething} method.
     */
    class InnerMET05J extends MET05J {
        /** A message specific to the derived class. */
        private String message = "Message from Derived class";

        /**
         * Prints the message from the derived class.
         */
        @Override
        public void printSomething() {
            System.out.println(message);
        }
    }

    /**
     * The entry point of the application.
     * <p>
     * This method creates an instance of the base class and an instance
     * of the inner class.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        MET05J m = new MET05J();
        InnerMET05J im = m.new InnerMET05J();
    }
}
