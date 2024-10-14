import java.io.*;

public class fio04{
    public static void main(String args[]){
        String file = "filename.txt";
        BufferedReader reader;

        try{
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if(reader != null){
                try{
                    reader.close();
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

    }
}