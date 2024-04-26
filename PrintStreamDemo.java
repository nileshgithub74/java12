import java.io.*;
import java.util.*;


class Student{
    int rollno;
    String name;
    String dept;

}



public class PrintStreamDemo {
    
    public static void main(String[] args)throws Exception
    {
        // FileOutputStream fos = new FileOutputStream("file.txt");
        // PrintStream p  = new PrintStream(fos);

        // Student s = new Student();
        // s.rollno = 10;
        // s.name = "Nilesh";
        // s.dept = "cse";

        // p.println(s.rollno);
        // p.println(s.name);
        // p.println(s.dept);

        FileInputStream fis = new FileInputStream("file.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));


        Student s = new Student();
        s.rollno = Integer.parseInt(br.readLine());
        s.name = br.readLine();
        s.dept = br.readLine();
        System.out.println(s.dept);




    }
}
