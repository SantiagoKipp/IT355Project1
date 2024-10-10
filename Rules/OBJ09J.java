package GroupProject1;

/**
 * The {@code OBJ09J} class demonstrates basic inheritance in Java, where
 * a {@code Dog} class extends an {@code Animal} class.
 * 
 * <p>
 * This class includes methods to create an instance of {@code Dog}
 * and checks its type using the {@code getClass} method.
 */
public class OBJ09J {

    /**
     * The {@code Animal} class serves as a base class for different types of
     * animals.
     */

    public class Animal {
    }

    /**
     * The {@code Dog} class is a subclass of {@code Animal}, representing a
     * specific
     * type of animal.
     */
    public class Dog extends Animal {
    }

    /**
     * The entry point of the application.
     * <p>
     * This method creates an instance of the {@code Dog} class and checks
     * if the created object is of type {@code Dog}. It prints the result
     * to the console.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        OBJ09J o = new OBJ09J();
        Animal a = o.new Dog(); // Create an instance of Dpg and reference it as Animal.

        // Check if the created object is an instance of Dog.
        if (a.getClass() == Dog.class) {
            System.out.println("This is a Dog");
        } else {
            System.out.println("This is not a Dog");
        }
    }

}
