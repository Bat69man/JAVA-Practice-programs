/*
    Writing in Files using FileWriter Class
*/
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileEx7 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter("test.txt",true);

        System.out.print("\n Enter line to add in file: ");
        String line = sc.nextLine();

        try 
        {
            fileWriter.write("\n" + line);
            System.out.println("\n => Message: content is written in file.");
        }
        catch(Exception e) 
        {
            System.out.println("\n Error: "+e+"\n => Message: content is NOT written in file !");
        }

        // Must close file objects to save content into file
        fileWriter.close();
        sc.close();
    }
}