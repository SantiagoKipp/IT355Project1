import java.io.*;

/**
 * Demonstrates rule SER01-J. Do not deviate from the proper signatures of serialization methods (P27)
 * A simple class that represents a person and demonstrates custom serialization
 * by implementing private readObject and writeObject methods.
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String name;
    private int age;

    /**
     * Constructs a new Person instance with the specified name and age.
     *
     * @param name The person's name.
     * @param age The person's age.
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Demonstrates serialization and deserialization of a Person object.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Person person = new Person("Richard D. James", 53);
        String filename = "person.ser";

        // Serialize the Person object to a file
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(person);
            System.out.println("Person object has been serialized.");
        } catch (IOException e) {
            System.err.println("IOException during serialization: " + e.getMessage());
        }

        // Deserialize the Person object from the file
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Person deserializedPerson = (Person) in.readObject();
            System.out.println("Person object has been deserialized.");
            System.out.println("Name: " + deserializedPerson.name);
            System.out.println("Age: " + deserializedPerson.age);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Exception during deserialization: " + e.getMessage());
        }
    }

    /**
     * Custom deserialization logic.
     *
     * @param in The ObjectInputStream used to read the serialized object.
     * @throws IOException If an I/O error occurs while reading the stream.
     * @throws ClassNotFoundException If the class of a serialized object cannot be found.
     */
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        System.out.println("Custom readObject method called during deserialization.");
    }

    /**
     * Custom serialization logic.
     *
     * @param out The ObjectOutputStream used to write the serialized object.
     * @throws IOException If an I/O error occurs while writing to the stream.
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        System.out.println("Custom writeObject method called during serialization.");
    }
}
