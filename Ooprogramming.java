
// public class Ooprogramming {

//     class Student {
//         public int rolNo;
//         public String Name;
//         public double balance;

//         public void deposit() {
//             int range;
//         }

// //     }

// // }

// class Circle{
//     public double radius;

//     public double area(){
//         return Math.PI *radius *radius;
//     }

//     public double perimeter(){
//         return 2*Math.PI*radius;

//     }
//     public double circumference(){
//         return perimeter();
//     }
// }

// public class Ooprogramming{
//     public static void main(String[] args){

//        // int radius = 7;
//         Circle c1 = new Circle();
//         c1.radius = 7;

//         System.out.println("Area : "+ c1.area());
//         System.out.println("Perimeter : "+c1.perimeter());
//         System.out.println("Circumference :"+ c1.circumference() );
//     }

// }

// class Rectangle {
//     public int length;
//     public int breadth;

//     public int area() {
//         return length * breadth;
//     }

//     public int perimeter() {
//         return 2 * (length + breadth);

//     }
// }

// public class Ooprogramming {
//     public static void main(String[] args) {

//         Rectangle r1 = new Rectangle();
//         r1.length = 10;
//         r1.breadth = 50;

//         System.out.println("Area :" + r1.area());
//         System.out.println("Perimeter :" + r1.perimeter());

//     }
// }

// class Cyclinder{
//     public double radius ;
//     public double height;

//     public double lidArea(){
//         return Math.PI*radius*radius*height;
//     }
//     public double circumference(){
//         return  2*Math.PI* radius;

//     }

// }

// public class Ooprogramming{
//     public static void main(String[]args){
//         Cyclinder c1 = new Cyclinder();

//         c1.radius = 3;
//         c1.height = 5;

//         System.out.println("Area :"+ c1.lidArea());

//     }
// }

// class Student {
//     public String name;
//     public int rollNo, m1, m2, m3;
//     public String course;

//     public int Totalmarks() {
//         return m1 + m2 + m3;

//     }

//     public float Average() {
//         return (float) Totalmarks() / 3;

//     }

//     public char grade() {
//         if (Average() >= 60)
//             return 'A';
//         else
//             return 'B';
//     }

//     public String details() {
//         return "Roll No :" + rollNo + "\n" + "Name :" + name + "\n" + "Course :" + course + "\n";
//     }

// }

// public class Ooprogramming{
//     public static void main(String[] args) {
//         Student s = new Student();

//         s.name = "Nilesh";
//         s.rollNo = 20;
//         s.course = "CSE";
//         s.m1 = 2;
//         s.m2 = 3;
//         s.m3 = 10;
        
//          System.out.println("Totalmarks : "+s.Totalmarks());
//          System.out.println("Details :"+ s.details());


//     }
// }



// <====================DATA HINDIN ======




// class Rectangle {
//     private int length;
//     private int breadth;


//     public int getLength(){
//         return length;
//     }
//     public int breadth (){
//         return breadth;

//     }
//     public void setLength(int l){
//         if(l>0)
//            length = l;
//         else 
//            length =0;
//     }

//     public void setBreadth(int b){

//         if(b>0){
//             breadth = b;
//         }
//         else 
//          breadth = 0;

//     }

//     public int area() {
//         return length * breadth;
//     }

//     public int perimeter() {
//         return 2 * (length + breadth);

//     }
// }

// public class Ooprogramming {
//     public static void main(String[] args) {

//         Rectangle r1 = new Rectangle();
//         r1.setLength(10);
//         r1.setBreadth(50);

//         System.out.println("Area :" + r1.area());
//         System.out.println("Perimeter :" + r1.perimeter());

//     }
// }
