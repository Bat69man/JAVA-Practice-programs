import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileEx2 {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);

        FileOutputStream fout = new FileOutputStream("test.txt",true);

        System.out.println("\n Enter string to append in file: ");
        String s = sc.nextLine();

        for(short i=0 ; i<s.length() ; i++)
            fout.write(s.charAt(i));

        fout.close();
        sc.close();
    }
}
