public class err07{
    public static void main(String[] args) {
        try {
            // Trying to divide by 0
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Trying to divide by 0");
        }
    }

    // Simple division method
    public static int divide(int a, int b) {
        return a / b;
    }
}
