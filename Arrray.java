public class Arrray {

public static void main(String[] args) {
// int a[] = new int [5];
int b[]= {1,2,3,4,5};

b[2]=12;

for(int x : b)
{
System.out.println(x);
}
}
}

/// FINDING THE SUM OF ALL THE ELEMENT

// public class Arrray{
// public static void main(String[] arg)
// {
// int a[] = {1,2,3,4,5};

// int sum = 0;

// for(int i = 0; i<5; i++)
// {
// sum = sum + a[i];

// }
// System.out.println("sum :" + sum);

// }
// }

// import java.util.Scanner;
// public class Arrray{
// public static void main(String[] args) {
// int a[] = {1,2,3,4,5};
// int key;
// Scanner sc = new Scanner(System.in);
// key = sc.nextInt();
// int i;

// for( i= 0; i<a.length ; i++)
// {
// if(a[i]==key){
// System.out.println("The element found at index "+i+"="+ (key));
// }
// }
// System.out.println("Not found");

// }
// }

// public class Arrray{
// public static void main(String[] args) {
// int i=0;
// int a[] = {1,2,34,5,6,756};
// int max = a[0];

// for( i=0; i<a.length; i++)
// {
// if(a[i]>max)
// {
// max = a[i];

// }
// }
// System.out.println("Maximum No. =" +max);
// }
// }

/////// ----ROTATION OF AN ARRAY -----

// public class Arrray {
// public static void main(String[] args) {
// int a[] = {1,2,3,4,5,6,7,8,9,10};
// int temp= a[0];

// for( int i=1 ;i<a.length; i++)
// {
// a[i-1] = a[i];

// }
// a[a.length-1] = temp;

// for(int x : a)
// System.out.print(x +",");

// }
// }

// public class Arrray {
// public static void main(String[] args) {
// int a[] = {1,2,3,4,5,6,7,8,9,10};
// int temp= a[a.length-1];

// for( int i=1 ;i<a.length; i++)
// {
// a[i] = a[i -1 ];

// }
// a[0] = temp;

// for(int x : a)
// System.out.print(x +",");

// }
// }

// public class Arrray {
// public static void main(String[] args) {
// int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
// int temp = a[a.length - 1];

// for (int i = 1; i < a.length; i++) {
// a[i] = a[i - 1];
// }
// a[0] = temp;

// for (int x : a)
// System.out.print(x + ",");
// }
// }

// import java.util.Scanner;
// public class Arrray{
// public static void main(String[] args) {
// int a[] = new int[10];
// a[0] = 1;
// a[1] = 2;
// a[2] = 3;
// a[3] = 10;
// a[4] = 4;
// a[5] = 5;
// int n =6;
// System.out.println("Enter the number : ");
// Scanner sc = new Scanner(System.in);
// int num= sc.nextInt();
// System.out.println("Enter the index");
// int index = sc.nextInt();

// for(int i =0; i<n; i++){
// System.out.print( a[i] + ",");
// System.out.print("");
// }
// System.out.println("\n");

// for(int i=n; i>index; i--){
// a[i] = a[i-1];

// }
// a[index] = num;

// System.out.println("The updated array are :");
// for(int i =0;i<n; i++){
// System.out.print( a[i] + ",");
// System.out.print("");
// }

// sc.close();

// }
// }

// import java.util.Scanner;
// public class Arrray{
// public static void main(String[] args) {
// int a[] = new int[10];
// a[0] = 1;
// a[1] = 2;
// a[2] = 3;
// a[3] = 10;
// a[4] = 4;
// a[5] = 5;
// int n =6;
// // System.out.println("Enter the number : ");
// Scanner sc = new Scanner(System.in);
// // int num= sc.nextInt();
// System.out.println("Enter the index");
// int index = sc.nextInt();

// for(int i =0; i<n; i++){
// System.out.print( a[i] + ",");
// System.out.print("");
// }
// System.out.println("\n");

// for(int i=n; i>index; i--){
// a[i] = a[i-1];

// }
// a[index] = num;

// System.out.println("The updated array are :");
// for(int i =0;i<n; i++){
// System.out.print( a[i] + ",");
// System.out.print("");
// }

// sc.close();

// }
// }

// public class Arrray {
// public static void main(String[] args) {

// int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
// int[] b = new int[10];
// for (int i = 0; i < a.length; i++)
// {
// b[i] = a[i];
// System.out.print(b[i] +",");

// }

// // for (int i = 0; i < b.length; i++) {
// // System.out.println(b[i]);
// // }

// }
// }

// public class Arrray {
// public static void main(String[] args) {

// int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
// int[] b = new int[10];
// for (int i = 0; i < a.length; i++)
// {
// b[i] = a[a.length-1-i];
// System.out.print(b[i] +",");

// }

// // for (int i = 0; i < b.length; i++) {
// // System.out.println(b[i]);
// // }

// }
// }

// public class Arrray {
// public static void main(String[] args) {

// int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
// int[] b = new int[20];
// for (int i = 0; i < a.length; i++)
// {
// b[i] = a[i];

// }

// for (int i = 0; i < b.length; i++) {
// System.out.print(b[i]+ " , ");
// }

// }
// }

// public class Arrray {
//     public static void main(String[] args) {
//         int n = 257;

//         while (n > 0) {
//             int r = n % 10;
//             n = n / 10;
//             System.out.print(r);

//         }
//         // System.out.println(n);

//     }}

//     // import java.util.Scanner;
//     // public class Arrray{
//     // public static void main(String[] args){
//     // Scanner sc = new Scanner(System.in);

//     // int n = sc.nextInt();
//     // int count =0;

//     // while(n >0){
//     // int r= n %10;
//     // n = n /10;
//     // count ++;
//     // // System.out.println(r);

//     // }
//     // System.out.println(count);
//     // // System.out.println(n);
//     // sc.close();

//     // }
//     // }
