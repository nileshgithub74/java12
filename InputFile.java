import java.util.*;
import java.io.*;
public class InputFile {
    public static void main(String[] args)
    {
        try(FileInputStream fis = new FileInputStream("file.txt"))
        {
           // byte[] b = new byte[fis.available()];
           // fis.read(b);
           // String str = new String(b);
           // System.out.println(str);

           int x;
           while((x=fis.read()  ) != -1){
            System.out.print((char)x);

           }

        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){

            System.out.println("IO Exception");
        }


    }
    
}
