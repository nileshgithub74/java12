import java.util.*;
public class ArrayListPractice{
    public static void main(String[] args){
        ArrayList<Integer> arrlist = new ArrayList<>(20);
        ArrayList<Integer> arrlist2 = new ArrayList<>(List.of(10,20,30,40,50,60, 70));
        arrlist.add(10);
        arrlist.add(10);
    
        arrlist.add(0,5);
        arrlist.addAll(1,arrlist2);

     System.out.println(arrlist);
    //  arrlist.clear();
    //  System.out.println(arrlist);
//    System.out.println( arrlist.contains(10));
// System.out.println(arrlist.indexOf(40));
// arrlist.set(4,1000);
// System.out.println(arrlist);


// Iteration 
   

// for(int i=0; i<arrlist.size(); i++){
//     System.out.print(arrlist.get(i)+" ");
// }


// Iterator<Integer> it = arrlist.iterator();

// while(it.hasNext()){
//     System.out.print(it.next());
// }

// ListIterator<Integer>  it = arrlist.listIterator();
// while(it.hasNext()){
//     System.out.println(it.next());
// }


// for(ListIterator<Integer> it = arrlist.listIterator();it.hasNext();){
//       System.out.println(it.next());
// }




    }
}
