import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class FileEx4 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        FileWriter fw = new FileWriter("test.txt",true);
        
        BufferedWriter bf = new BufferedWriter(fw);

        System.out.print("\n Enter String to append in file: ");
        String s = sc.nextLine();

        bf.write("\n" + s);
        bf.close();
        sc.close();
    }
}
