/**
 * The exp53 class demonstrates a simple arithmetic operation on integer variables.
 * It calculates an expression using four integers and prints the result to the console.
 */
public class exp53 {

    /**
     * The main method initializes four integer variables and calculates the result of an expression
     * involving multiplication, addition, and subtraction. It then outputs the result.
     */
    public static void main(String[] args) {
        int w = 12;
        int x = 5; 
        int y = 14; 
        int z = 1;  

        // Calculate the result
        int result = (w * x) + y + (w - z);

        // Print the result to the console
        System.out.println("Result: " + result);
    }
}
