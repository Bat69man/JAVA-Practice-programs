import java.io.File;
import java.io.IOException;

public class FileEx1 {
    public static void main(String[] args) throws IOException {
        
        File f = new File("test.txt");
        
        if( ! f.exists() ) {
            if(f.createNewFile())
                System.out.println("\n => File created");
        }
        
        System.out.println("\n File name: "+f.getName());
        System.out.println(" File Size: "+f.length());
        System.out.println(" File Path: "+f.getAbsolutePath());
        System.out.println(" is Readable: " + f.canRead());
        System.out.println(" is Writable: " + f.canWrite());
        System.out.println(" is Executable: " + f.canExecute());

        if(f.delete())
            System.out.println("\n => File is deleted");
        
        f = new File("D:\\VsCode\\Java\\File managment");
        
        for(String filename: f.list())
            System.out.println(filename);
    }
}