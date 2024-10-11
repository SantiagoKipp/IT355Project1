/**
 * MET06J 
 * Rule: Do not invoke overridable methods in clone().
 */
public class MET06J {

    /**
     * The Person class represents an individual with a name and supports cloning.
     */
    public class Person implements Cloneable {
        private String name;

        // Constructor to initialize the Person object with a name
        public Person(String name) {
            this.name = name;
        }

        /**
         * Clones the current Person object.
         *
         * @return A new Person object that is a clone of this instance.
         * @throws CloneNotSupportedException if the object's class does not support the Cloneable interface.
         */
        @Override
        protected Object clone() throws CloneNotSupportedException {
            // Call Object's clone() method to create a shallow copy
            Person cloned = (Person) super.clone();
            // Directly copying the field instead of using the setter (which could be overridden)
            cloned.name = this.name;
            return cloned;
        }

        /**
         * Gets the name of the person.
         *
         * @return The name of the person.
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the name of the person.
         *
         * @param name The name to set for the person.
         */
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "'}";
        }
    }

    public static void main(String[] args) {
        try {
            // Create an instance of the MET06J class to access the Person class
            MET06J outer = new MET06J();
            Person person1 = outer.new Person("John wick");

            // Clone the person1 object
            Person person2 = (Person) person1.clone();

            // Output both original and cloned objects to demonstrate the clone operation
            System.out.println("Original person: " + person1);
            System.out.println("Cloned person: " + person2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
