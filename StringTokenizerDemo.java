import java.util.*;
import java.io.*;
public class StringTokenizerDemo{
    public static void main(String[] args){
        String data="name=nilesh;address=delhi;country=india; dep=cse";

        StringTokenizer stk = new StringTokenizer(data,"=;");

        String s;
        while(stk.hasMoreTokens()){
            s=stk.nextToken();
            System.out.println(s);
        }

    }
}