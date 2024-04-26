import java.util.*;
import java.io.*;
public class BytesArrayDemo {
    public static void main(String[] args)throws Exception
    {

        // byte[] b = {'a', 'b','c','d','e'};
        // ByteArrayInputStream bis = new ByteArrayInputStream(b);
        // // int x;

        // // while((x = bis.read()) != -1){
        // //     System.out.println((char)x);
        // // }

        // String str = new String(bis.readAllBytes());
        // System.out.print(str);


        ByteArrayOutputStream bos = new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');

        // byte b[]= bos.toByteArray();

        // for(byte x: b){
        //     System.out.println((char)x);
        // }

        bos.writeTo(new FileOutputStream("file.txt"));
        bos.close();



    }

    
}
