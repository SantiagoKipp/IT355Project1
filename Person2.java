/**
 * Demonstrate rule OBJ13-J. Ensure that references to mutable objects are not exposed (P18)
 * A class representing a person with a name and birth date. 
 * Ensures safe handling of the birth date array by returning a copy rather than the array itself.
 */
public class Person2 {

    private String name;
    private int[] birthDate;

    /**
     * Constructs a new Person2 instance with the specified name and birth date.
     *
     * @param name The name of the person.
     * @param birthDate An array representing the person's birth date (e.g., [year, month, day]).
     */
    public Person2(String name, int[] birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /**
     * Returns a copy of the birth date array to preserve encapsulation.
     *
     * @return A copy of the birth date array.
     */
    public int[] getBirthDate() {
        return birthDate.clone();
    }

    /**
     * Main method to demonstrate the usage of the Person2 class and its safe handling of the birth date array.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        int[] birthDate = {1990, 5, 15};
        Person2 person = new Person2("John Doe", birthDate);

        // Retrieve and display the birth date
        int[] retrievedBirthDate = person.getBirthDate();
        System.out.println("Birth Date: " + retrievedBirthDate[0] + "-" + retrievedBirthDate[1] + "-" + retrievedBirthDate[2]);

        // Modify the retrieved array to demonstrate that the original array remains unchanged
        retrievedBirthDate[0] = 2000;  // This change does not affect the person's birthDate

        // Verify that the original birth date in the Person2 object remains the same
        int[] originalBirthDate = person.getBirthDate();
        System.out.println("Original Birth Date remains unchanged: " + originalBirthDate[0] + "-" + originalBirthDate[1] + "-" + originalBirthDate[2]);
    }
}
