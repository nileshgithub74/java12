// import java.util.*;
// public class PracticeCA{
//     public static void main(String[] args){

        
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the numbers: ");
//         int a  = sc.nextInt();
//         int b  = sc.nextInt();
//         int c;
       
//         try{
//         c = a/b;

//         System.out.println(c);
//         }
//         catch(ArithmeticException e){
//             System.out.println("Denominator never be negative");
//         }
//           System.out.println("Bye");

//     }
// }




// import java.util.*;
// import java.io.*;

// public class PracticeCA {

//     static class LowBalanceException extends Exception {
//         public String toString() {
//             return "Balance should not be zero";
//         }
//     }

//     static void fun1() throws LowBalanceException {
//         throw new LowBalanceException();
//     }

//     public static void main(String[] args) {
//         try {
//             fun1();
//         } catch (LowBalanceException e) {
//             System.out.println(e); // Print the error message
//             // Handle the exception gracefully if needed
//         }
//     }
// }



// import java.util.*;

// public class PracticeCA {

//     static void meth1()
//     {
//        System.out.println( 10/0);
//     }
//     static void meth2()
//     {
//         meth1();
//     }
//     static void meth3(){
//         meth2();
//     }

   
//     public static void main(String[] args) {
//         try{
//         meth3();
//         }catch(ArithmeticException e){
//             System.out.println(e);
//         }
       
//     }
// }





// import java.util.*;


// class NegativeDemExpection extends Exception{
//     public String toString(){
//         return " Dimension cannot be negative.";
//     }

// }

// public class PracticeCA {

//    static int area(int l, int b)throws NegativeDemExpection
//    {
//     if(l<0 || b<0)
//         throw new NegativeDemExpection();
//     return l*b;
//    }
//    static void meth1()throws NegativeDemExpection
//    {
//     System.out.println("Area is : "+area(-10,5));
//    }

   
//     public static void main(String[] args)
//      {
//         try{
//         meth1();
//         }catch(NegativeDemExpection e){
//             System.out.println(e);
//         }
       
//     }
// }


// Try with resource :




// import java.util.*;
// import java.io.*;


// public class PracticeCA {


//      static FileInputStream f1;
//      static Scanner sc;

//     static void Divide()throws Exception
//     {
//         try{
//         f1 = new FileInputStream("file.txt");
//         sc = new Scanner(f1);
//         int  a = sc.nextInt();
//         int  b = sc.nextInt();
//         int  c = sc.nextInt();

//         System.out.println(a/c);
//         }
//         finally{

//         f1.close();
//         sc.close();
//         }


//     }

  
//     public static void main(String[] args)throws Exception
//      {

//         Divide();
//         int x = sc.nextInt();
//         System.out.println(x);
        
       
//     }
// }

