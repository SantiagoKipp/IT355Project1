/**
 * Demonstrates recommendation DCL52-J. Do not declare more than one variable per declaration
 * A class representing a car, following the guideline to declare
 * only one variable per line for clarity and maintainability.
 */
public class Car {

    // Initialize these variables on separate lines for readability
    private static String make = "Suzuki";
    private static String model = "XL-7";

    /**
     * Main method to demonstrate the Car class with make and model attributes.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println("Car make: " + make);
        System.out.println("Car model: " + model);
    }
}
