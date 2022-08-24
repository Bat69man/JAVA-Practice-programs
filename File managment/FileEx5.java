import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FileEx5 {
    public static void main(String[] args) throws IOException {
        
        FileReader fr = new FileReader("test.txt");

        BufferedReader bf = new BufferedReader(fr);


        String s;
        while ( (s = bf.readLine()) != null )
            System.out.println(s);
        bf.close();
    }
}