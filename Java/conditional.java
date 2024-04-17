// // public class conditional {
// //     public static void main(String[] args) {
// //         int a = 5, b= 10 , c= 15;

// //         System.out.println(a>b && b>c);

// //     }
// // }

// // import java.util.*;
// // public class conditional{
// //     public static void main(String[] args) {
// //         int n;
// //         System.out.println("Enter the number: ");

// //         Scanner sc = new Scanner(System.in);
// //         n=sc.nextInt();
// //         if(n%2==0)
// //         {
// //             System.out.println("Even");
// //         }
// //         else if(n%2 !=0)
// //         {
// //             System.out.println("odd");
// //         }

// //         sc.close();
// //     }
// // }

// import java.util.*;

// public class conditional{
//     public static void main(String[] args)
//     {
//         int age;

//         System.out.println("Enter the age :");

//         Scanner sc = new Scanner(System.in);

//         age = sc.nextInt();

//         if(age>=18)
//         {
//             System.out.println("Not Young");
//         }
//         else if(age<18)
//         {
//             System.out.println("Younger");
//         }

//         sc.close();

//     }

// }

// import java.util.Scanner;

// public class conditional {
//     public static void main(String[] args) {
//         int year;
//         System.out.println("Enter the year : ");
//         Scanner sc = new Scanner(System.in);
//         year = sc.nextInt();
//         if (year % 4 == 0) {
//             if (year % 100 == 0) {
//                 if (year % 400 == 0) {

//                     System.out.println("Yes it is leap year");
//                 } 
//                 else {
//                     System.out.println("Not a leap year");
//                 }
//             } 
//             else {
//                 System.out.println("Its  the leap year");
//             }

//         } 
//         else {
//             System.out.println("NOt a leap year");
//         }

//         year = sc.nextInt();
//         sc.close();

//     }
// }

// import java.util.Scanner;

// public class conditional{
//     public static void main(String[] args) {
//         int day;
//         System.out.println("Enter the day number :");
//         Scanner sc = new Scanner(System.in);

//         day = sc.nextInt();
//         if(day==1)
//         {
//             System.out.println("MOnday");
//         }
//         else if(day==2)
//         {
//             System.out.println("Tuesday");

//         }
//         else if(day==3){
//             System.out.println("Wednesday");
//         }
//         else if(day==4){
//             System.out.println("Thursday");
//         }
//         else if(day== 5){
//             System.out.println("Friday");
//         }
//         else if(day == 6){
//             System.out.println("saturaday");

//         }
//         else if (day == 7){
//             System.out.println("Sunday");
//         }
//         else{
//             System.out.println("Invalid Day");
//         }

//         sc.close();

//     }
// }

// import java.util.Scanner;
// public class conditional{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the  url");
//         String url = sc.nextLine();

//         sc.close();

//     }
// }

// import java.util.Scanner;

// public class conditional {
//     public static void main(String[] args) {
//         int day;

//         System.out.println("Enter the  day number : ");
//         Scanner sc = new Scanner(System.in);

//         day = sc.nextInt();

//         switch (day) {
//             case 1:
//                 System.out.println("monday");

//                 break;
//             case 2: 
//              System.out.println("Tuesday");
//              break;

//              case 3 :

//              System.out.println("wednesday");
//              break;

//              default :
//              System.out.println("Invalid number ");
//              break;

        

//         }

//     }
// }



public class conditional{
    public static void main(String[] args) {

        String str1 = "Lpu";
        String  str2 = "Lpu";


        
        System.out.println(str1==str2);



        
    }
}