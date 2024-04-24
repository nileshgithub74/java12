import java.lang.reflect.Array;
import java.util.*;
public class DequeDemo{
    public static void main(String[] args){
        ArrayDeque<Integer> dq= new ArrayDeque<>();
        dq.offerLast(10);
        dq.offerLast(20);
        
        dq.offerLast(30);

        dq.forEach((x)->System.out.println(x));

        dq.offerFirst(1);
        dq.offerFirst(2);
        dq.offerFirst(3);

        dq.forEach((x)->System.out.println(x));

      


    }
}