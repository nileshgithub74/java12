// // ====== how to take input in  array in java =======
// import java.util.Scanner;
// public class practice{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the number of Element: ");
//         int n = sc.nextInt();

//         int[] array = new int[n];
//         System.out.println("Enter the element in the array: ");

//         for(int i=0; i<array.length; i++){
//             array[i] = sc.nextInt();
//         }
//         System.out.println("Array element are :");
//         for(int i=0; i<array.length; i++)
//         {
//             System.out.print(array[i]+" ");
//         }
//         sc.close();

//     }
// }

// public class pratice{
//     public static void main(String[] args) {
//         method(null);
//     }
//     public static void main(Object o){
//         System.out.println("object method");
//     }
//     public static void main(String s) {
//         System.out.println("String metho");
//     }
// }\

// public class pratice{
//     public static void main(String[] args) {
//         Integer num1 = 500; 
//         Integer num2 = 500;
//         if(num2==num1){
//             System.out.println("true");
//         }
//         else{
//             System.out.println("false");
//         }

//     }
// }

// public class pratice{
//     public static void main(String[] args) {
//         //u000d System.out.println("hello");
//         int i = 20+ +9 - -12+ +4 - - 13+ + 19;
//         System.out.println(i);
//     }
// }

// public class practice{
//     public static void main(String[] args) {
//         String str1 ="Nilesh";
//         String str2 = new String("Java");
//    System.out.println(str1);

//     }

// }

// public class practice{
//     public static void main(String[] args){
//         String str = new String("           NileshKumarSreyansh     ");

//         // int l = str.length();
//         // System.out.println("Length of the string:"+l);
//         // str = str.toLowerCase();
//         // String str1 = str.toUpperCase();

//          //str = str.substring(1,5);
//         // str = str.replace('n', 'k');
//       //  System.out.println(str);
//         // System.out.println(str1);

//     }
// }

// public class practice{
//     public static void main(String[] args) {
//         // String str = "Mr.Nilesh kumar";
//         // // System.out.println( str.startsWith("Mr"));

//         // System.out.println( str.charAt(4));
//    String str = "www.udemy.co.in";
//    System.out.println(str.indexOf(".",4));

//     }
// }

// public class practice{
//     public static void main(String[] args){
//         String str1 = "Pyramid";
//         String str2 ="pyramid";
//         String str3 ="Pyramid";

//         System.out.println(str1.equals(str2));
//         System.out.println(str1.equals(str3));
//     }
// }

// public class practice{
//     public static void main(String[] args){
//         String str1 = "a";
//         System.out.println(str1.matches("[ab]"));

//     }
// }

// public class practice{
//     public static void main(String[] args){
//         String str = "programmer@gmail.com";

//         int i = str.indexOf("@");
//         String username = str.substring(0,i);
//         String domainName = str.substring(i+1,str.length());

//         System.out.println("Username : "+username);
//         System.out.println("Domain Name   :"+domainName);

//         int x = domainName.indexOf
//         (".");

//         System.out.println(domainName.startsWith("gmail"));

//     }
// }

// public class practice{
//     public static void main(String[] args) {
//     //     int b = 1010111;
//     //   String str = String.valueOf(b);
//     //    //String str = b +"";
//     //     System.out.println(str.matches("[01].+"));
//     // String str = "B234A";
//     // System.out.println(str.matches("[0-9A-F]"));

//     String date ="01/12/2002";
//     System.out.println(date.matches([0-3][0-9]/));

//     }
// }

// public class practice{
//     public static void main(String[] args){
//         int[][] A = {{1, 2, 3}, {4, 5, 6}};
//         int[][] B = {{7, 8}, {9, 10}, {11, 12}};

//         int[][] result = new int[A.length][B[0].length];

//         for(int i=0; i<A.length; i++){
//             for(int j=0; j<B[0].length; j++){
//                 for(int k=0;k < A.length; k++ ){
//                    result [i][j] += A[i][k] * B[k][j];
//                 }
//             }
//         }

//         for(int x[] : result){
//             for(int y : x){
//                 System.out.print(y+ " ");
//             }
//             System.out.println(" ");

//         }
//     }
// }

// public class practice{
//     public static void main(String[] args){

//         for(int i =1; i<=10; i++){
//             for(int j=1; j<=5; j++){
//                 System.out.print(j +" ");
//             }

//            System.out.println("");
//         }

//     }
// }

// public class practice{
//     public static void main(String[] args){

//         for(int i =1; i<=5; i++){
//             for(int j=1; j<=5; j++){
//                 System.out.print(i +" ");

//             }

//            System.out.println("");
//         }

//     }
// }

// public class practice{
//     public static void main(String[] args){
//         for(int i =1; i<=5; i++){
//             for(int j=1; j<=5; j++){
//                 System.out.print((i+j)+"");
//             }
//             System.out.println("");
//         }

//     }
// }

// public class practice{
//     public static void main(String[] args){
//         int count =0;
//         for(int i =1; i<=5; i++){
//             for(int j=1; j<=5; j++){
//                 count++;
//                 System.out.format("%02d ", count);
//             }
//             System.out.println(" ");
//         }

//     }
// }

// public class practice{
//     public static void main(String[] args){

//         for(int i =1; i<=5; i++){
//             for(int j=1; j<=i; j++){

//                 System.out.print(j+" ");
//             }
//             System.out.println(" ");
//         }

//     }
// }

// public class practice {
//     public static void main(String[] args) {

//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {

//                 System.out.print(j + " ");
//             }
//             System.out.println(" ");
//         }

//     }
// }

// public class practice {
//     public static void main(String[] args) {
//          int count =0;
//         for (int i=1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {
//                 count ++;
//                 System.out.print(  count + " ");
//             }
//             System.out.println(" ");
//         }

//     }
// }

// public class practice {
//     public static void main(String[] args) {

//         for (int i=1; i <= 5; i++) {
//             for (int j = 1; j <= i; j++) {

//                 System.out.print( "* ");
//             }
//             System.out.println(" ");
//         }

//     }
// }

// public class practice {
//     public static void main(String[] args) {

//         for (int i=1; i <= 5; i++) {
//             for (int j = 1; j <= 5-i+1; j++) {

//                 System.out.print( j+" ");
//             }
//             System.out.println(" ");
//         }

//     }
// }



// public class practice {
//     public static void main(String[] args) {
//         for(int i=1; i<=5; i++){
//             for(int j=1; j<=5; j++){
//                 if(i+j >5){
//                     System.out.print("* ");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println("");
//         }

//     }
// }


public class practice{
    public static void main(String[] args) {
        
    }
}