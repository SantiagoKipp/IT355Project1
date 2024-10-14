public class num07{
    public static void main(String[] args) {
        float notANumber = Float.NaN;

        // Use Float.isNaN instead of == to compare to prevent unforeseen behavior
        if (Float.isNaN(notANumber)) {
            System.out.println("This is not a number");
        } else {
            System.out.println("This is a number!");
        }
    }
}
