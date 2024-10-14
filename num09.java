public class num09{
    public static void main(String[] args) {
        int counter = 10;
        int arr[] = new int[counter];

        // Using an integer data type as the loop counter to prevent rounding errors and infinite loops
        for(int i = 0; i <= counter - 1; i++) {
            arr[i] = 1 + i * 2;
        }
    }
}
