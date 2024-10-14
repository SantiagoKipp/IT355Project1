public class dcl53{

    public static void multiply(int [] numArr){
        result = 1; //Scope of result is limited to one method
        for (int i = 0; i < numArr.length; i++){
            result = result * numArr[i];
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {12, 10, 2, 5}; //arr is a local variable only in main.
        multiply(arr);
    }
}