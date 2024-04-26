import java.util.*;

import java.io.*;



public class DataStream {
    class Student{
        int rollno;
        String name;
        String dept;
    }

    public static void main(String[] args)throws Exception
    {

        FileOutputStream fos =new FileOutputStream("file.txt");
        DataOutputStream d = new DataOutputStream(fos);

        Student s = new Student() ;
        s.rollno = 10;
        s.name = "Nilesh";
        s.dept= "Cse";

        d.writeInt(s.rollno);
        d.writeUTF(s.name);
        d.writeUTF(s.dept);
        



    }
    
}
