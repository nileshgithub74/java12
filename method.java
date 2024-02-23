// public class method {

// int max(int x, int y)
// {
// if(x>y)
// return x;
// else
// return y;

// }
// public static void main(String[] args){
// int a = 10,b = 15, c;
// //c = max (a,b);

// method mp = new method();
// ; System.out.println(mp.max(a,b));
// }

// }

// public class method{

// static void change(int A[],int index, int value){
// A[index] = value;

// }
// public static void main(String[] args){
// int a[] = {1,2,3,4,5};

// change( a,2,20);

// for(int x: a){
// System.out.println(x);
// }

// }

// }

// public class method {

// static boolean isPrime( int n {

// for (int i = 2; i < n/2; i++) {
// if (n % i == 0) {
// return false;
// }
// return true;
// }

// }

// public static void main(String[] args) {
// System.out.println(isPrime(91));

// }

// }

// public class method{

// static int Gcd(int m , int n)

// {
// while(m!=n)
// if(m>n){
// m = m-n;
// }
// else {
// n= n-m;
// }
// return m;

// }

// public static void main(String[] args) {
// System.out.println(Gcd(15,2));

// }
// }

// public class method {
// static int area(int l, int b) {

// return l * b;

// }

// public static void main(String[] args) {

// int length = 10;
// int breadth = 20;

// int area = area(10, 20);
// System.out.println(area);

// }
// }

// public class method{

// static int rev(int n)
// {
// int reverse = 0;
// while(n>0){
// int r = n%10;
// n = n/10;

// reverse = reverse *10 + r;

// }
// return reverse ;

// }
// public static void main(String[] args){

// int n = 34;
// System.out.println(rev(n));

// }
// }

// public class method {

// boolean string(String name)
// {
// return name.matches("[a-zA-Z\\s]+")

// }
// boolean age (int age)
// {
// return age>= 3 && age<= 15;

// }
// // }

// public class method{
// static int show(int ... A)
// {
// for(int x:A){
// System.out.println(x);
// }
// return 0 ;

// }

// public static void main(String[] args) {
// //show();
// System.out.print(show(10,20,30,40));

// //show(new int[] {1,2,3,4,5} );
// }
// }

// }

// public class method {
// static void showList(int start, String... s) {
// for (int i = 1; i < s.length; i++) {
// System.out.println(start + " " + s[i]);
// start++;
// }
// }

// public static void main(String[] args) {
// showList(5, "nilesh", "komal", "sreyansh", "kumar");

// }
// }

// public class method{

// static int max(int ...A)
// {
// if(A.length==0)
// return Integer.MIN_VALUE;
// int maxNum = A[0];

// for(int i = 0; i<A.length; i++)
// {
// if(A[i]>maxNum){
// maxNum =A[i] ;
// }

// }
// return maxNum;

// }
// public static void main(String[] args) {
// System.out.println(max());
// System.out.println(max(10,20,30,40));

// }
// }

// public class method {

// static int max(int... A) {
// int sum=0;
// for(int x:A){
// sum = sum +x;
// }
// return sum;

// }

// public static void main(String[] args) {
// System.out.println(max());
// System.out.println(max(10, 20, 30, 40,35,34,23,12,34));

// }
// }


// import java.util.Scanner;

// public class method {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         int originalNumber = number;
//         int remainder, sum = 0;
//         int numberOfDigits = 0;

//         // Count the number of digits
//         while (number != 0) {
//             number /= 10;
//             numberOfDigits++;
//         }

//         // Calculate the sum of digits raised to the power of number of digits
//         number = originalNumber;
//         while (number != 0) {
//             remainder = number % 10;
//             sum += Math.pow(remainder, numberOfDigits);
//             number /= 10;
//         }

//         // Check if the sum is equal to the original number
//         if (sum == originalNumber) {
//             System.out.println(originalNumber + " is an Armstrong number.");
//         } else {
//             System.out.println(originalNumber + " is not an Armstrong number.");
//         }
//     }
// }


public class method {
    public static void main(String[] args){
        int num =80;
        int a = 0, b = 1, c;
        int count=0;

        System.out.println(a + " " + b);
        for(int i = 0; i < num-2; i++)
        {
            c = a + b;
            System.out.println(" " + c);
            a = b; 
            b = c;
            count ++;
        }
        System.out.println(count);
    }
}
