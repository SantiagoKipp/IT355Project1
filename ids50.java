import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ids50{
    public static void main(String[] args){
        if (args.length < 1){
            System.out.println("You did not input a file name");
        }
    String name = args[0];
    Pattern pattern = Pattern.compile("[^A-Za-z0-9._]");
    Matcher matcher = pattern.matcher(filename);
    if(matcher.find()){
        System.out.println("You have an error with your file name");
        return;
    }
    File file = new File(name);
    }
}