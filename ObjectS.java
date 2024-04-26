import java.util.*;
import java.io.*;


class Student implements Serializable{
    private int rollno;
    private String name;
    private String dept;
    public static int Data = 10;
    public transient int t;
    public Student(){

    }
    public Student(int r, String n,  String d){
        rollno = r;
        name= n;
        dept = d;
        Data = 500;
        t = 500;
    }

    public String toString(){
        return "\nStudent details\n"+
                 "\nRoll "+rollno+
                 "\n Name"+name+ " "+ "\n";

    }


}

public class ObjectS{
    public static void main(String[] args)throws Exception
    {

        FileOutputStream fos  =  new FileOutputStream("file.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Student s = new Student(10,"nilesh","cse");
        oos.writeObject(s);




    }
}