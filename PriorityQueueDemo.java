
// Priority queue :  this is queue in which elment are deleted or insert by their priority.
// High number - prioriti is low and vice versa.

import java.util.*;

class Mycom implements Comparator<Integer>
{
    public int compare(Integer o1, Integer o2){
        if(o1<o2) return 1;
        if(o1>02)return -1;
        return 0;
    }
}

public class PriorityQueueDemo{
    public static void main(String[] args){
PriorityQueue<Integer> p = new PriorityQueue<>(new Mycom());

p.add(20);
p.add(10);
p.add(30);
p.add(5);
p.add(15);
p.add(3);
//System.out.println(p.peek());

p.forEach((x) -> System.out.println(x));
p.poll();

p.forEach((x) -> System.out.println(x));



    }
}