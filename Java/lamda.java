// @FunctionalInterface
// interface Mylamda{
//     // public void display(String str);

   

    
                       
// }

// // class My implements Mylamda{
// //     public void display(){
// //         System.out.println("Heelo, this is nilesh kumar");
// //     }
// // }




// public class lamda{
//     public static void main(String[] args){

//         Mylamda m =  
//             (s) -> {
//                 System.out.println(s);
//             }
//         ;
//         m.display("Heelo world , this is nilesh kumar");

//     }
// }




// interface Mylamda{
//     public int add(int a, int b);
// }

// public class lamda{
//     public static void main(String[] args){
//     Mylamda m = (x,y) -> x+y;
//         int r = m.add(20, 30);
//         System.out.println(r);
//     }
// }


// interface Mylamda{
//     public void display();
// }

// class Demo{
//     int temp = 10;
//     public void method1(){
//       final   int count = 0;
//       Mylamda m = () -> {
         
//         System.out.println("hii");
//         System.out.println("Nilesh kumar" + (++temp));
//     };


//     }
// }

// public class lamda{
//     public static void main(String[] args){
//         Demo d  = new Demo();
//         d.method1();
//     }
// }



interface Mylamda{
    public void display();
}
class Uselamda{
    public void callLamda(Mylamda m){
      m.display();
    }
}

class Demo{
    public void method1(){
     Uselamda ul  = new Uselamda();
     ul.callLamda(() ->{System.out.println("NNilesh kumar");});
        }
}

public class lamda{
    public static void main(String[] args){
        Demo d = new Demo();
        d. method1();
    }
}