import java.util.*;
import java.io.*;

public class BufferStreamDemo {
    public static void main(String[] args)throws Exception
    {

        // FileInputStream fis = new FileInputStream("file.txt");
        // BufferedInputStream bis = new BufferedInputStream(fis);

        // int x ;
        // while((x=bis.read()) != -1){
        //     System.out.println((char)x);}

        FileReader fis = new FileReader("file.txt");
        BufferedReader bis = new BufferedReader(fis);
        int x;
        while((x=bis.read())!= -1){
            System.out.print((char)x);
        }


     



    }
    
}
