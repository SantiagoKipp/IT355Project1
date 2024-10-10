package GroupProject1;

/**
 * The {@code DCL54J} class demonstrates a simple calculation of the
 * area of a circle using a static method and constants.
 * 
 * <p>
 * This class includes a method to compute the area of a circle based
 * on its radius and a main method to print the result.
 */
public class DCL54J {
    /** The constant value of PI used in the area calculation. */
    private static final double PI = 3.14;

    /** The radius of the circle used in the calculation. */
    private static double radius = 4;

    /**
     * Computes the area of a circle based on the provided radius.
     *
     * @param radius The radius of the circle.
     * @return The area of the circle.
     */
    public static double areaOfCircle(double radius) {
        return PI * radius * radius;
    }

    /**
     * The entry point of the application.
     * <p>
     * This method prints the calculated area of the circle to the console.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        System.out.println("Area of Circle: " + areaOfCircle(radius));
    }
}
