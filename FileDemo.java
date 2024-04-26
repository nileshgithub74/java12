import java.io.FileOutputStream;
public class FileDemo {
    public static void main(String[] args)throws Exception
    {
        FileOutputStream fos = new FileOutputStream("file.txt");
        String str = "Learn java programming";

        // fos.write(str.getBytes());
        byte[] b = str.getBytes();

        //for(byte x: b){
        //     fos.write(b);
        // }
        fos.write(b);

      


        


    }
}
