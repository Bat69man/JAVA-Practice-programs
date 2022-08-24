/*
    Reading File using 'File' & 'Scanner' class.
*/
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileEx6 {
    public static void main(String[] args) throws IOException {

        File f = new File("test.txt");
        
        Scanner sc = new Scanner(f);

        while ( sc.hasNextLine() )
            System.out.println( sc.nextLine() ); 
        sc.close();
    }
}