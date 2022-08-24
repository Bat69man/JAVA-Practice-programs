import java.io.FileInputStream;
import java.io.IOException;

public class FileEx3 {
    public static void main(String[] args) throws IOException {

        FileInputStream fin = new FileInputStream("test.txt");

        System.out.println("-------- Reading File --------");
        
        int ch = fin.read();

        while (ch != -1) {
            System.out.print((char)ch);
            ch = fin.read();
        }
        fin.close();
    }
}
