/*
    Writing in Files using FileReader Class
*/
import java.io.FileReader;
import java.io.IOException;

public class FileEx8 {
    public static void main(String[] args) throws IOException {

        FileReader f = new FileReader("test.txt");
        /* 
        [][][][][f][i][][][][][][][][][]
        read()
        read(char [])
        read(char [] , int 5 , int 100)

        /******
        char [] array = new char[20];
        bf.read(array, 0, 20);
        OR
        bf.read(array, 0, array.length);
        System.out.println(array);
        
        Arguments:
        1) name of character array
        2) starting index from wich characters will be stored
        3) how many characters to be read from file.
        ******/

        char [] arr = new char[15];
        
        f.read(arr, 0, arr.length);
        System.out.print(arr);
/* 
        f.read(arr);
        System.out.print(arr);

        f.read(arr, 0, arr.length);
        System.out.print(arr);
   */ 
        // Must close file objects to save content into file
        f.close();
    }
}