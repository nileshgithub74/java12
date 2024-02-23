// class Rectangle{
//     private double length;
//     private double breadth;

//     public  Rectangle(){
//         length =1;
//         breadth = 1;
//     }
//     public Rectangle(double l, double b){
//         length =l;
//         breadth =b;
//     }
//     public Rectangle(double s){
//         length = breadth =s;
//     }
//     public double area(double l, double b){
//         return length*breadth;
//     }

// }
// public class constructor {
//     public static void main(String[] args){
//         double length=0, breadth=0;
//         Rectangle r = new Rectangle();
       

//     }




    
// }



// class Rectangle
// {
//     private double length;
//     private double breadth;
    
//     public  Rectangle(){
//         length =1;
//         breadth = 1;
//     }
//     public Rectangle(double l, double b){
//         setLength(l);
//         setBreadth(b);
//     }
//     public Rectangle(double s){
//         length = breadth =s;
//     }


//     public double getLength(){
//         return length;
//     }
//     public double getBreadth(){
//         return breadth;
//     }
//     public void setLength(double l){
//         if(l>=0)
//              length = l;
//         else
//            length =0;
             
//     }
//     public void  setBreadth(double b){
//         if(b>=0)
//              breadth = b;
//         else
//              breadth = 0;
//     }

//     public double area(){
//         return length *breadth;
//     }
//     public double perimeter(){
//         return 2*(length +breadth);
//     }

// }


// public class constructor{
//     public static void main(String[] args) {
//         Rectangle r = new Rectangle();

//         r.setBreadth(10);
//         r.setLength(-10);
//         System.out.println("Area :"+r.area());
//         System.out.println("Perimeter :"+r.perimeter());
//     }
// }


// class Cylinder
// {
//     private double radius;
//     private double height;


//     public double getRadius(){
//         return radius;


//     }
//     public double getHeight(){
//         return height;
//     }

//     public void setRadius(double r){
//        if(r>=0)
//               radius =r;
//         else
//             radius =0;
//     }
//     public void setHeight(double h){
//         if(h>=0)
//            height = h;
//         else 
//            height = 0;
//     }

//     public Cylinder()
//     {
//         radius =1;
//         height=1;

//     }
//     public Cylinder(double r, double h){
//         radius = r;
//         height =h;
//     }
    
//     public double lidArea()
//     {
//         return Math.PI*radius*radius;
//     }
//     public double perimeter()
//     {
//         return 2*Math.PI*radius;
//     }
//     public double drumArea()
//     {
//         return 2*lidArea()+perimeter()*height;
//     }
//     public double volume()
//     {
//         return lidArea()*height;
//     }

// }

// public class constructor{
//     public static void main(String[] args){
//         Cylinder c=new Cylinder();
//         c.setHeight(10);
//         c.setRadius(7);
       
//         System.out.println("LidArea "+c.lidArea());
//         System.out.println("Circumference "+c.perimeter());
//         System.out.println("totalSurfaceArea "+c.drumArea());
//         System.out.println("Volume "+c.volume());
//         System.out.println("Height"+c.getHeight());
//         System.out.println("Radius"+c.getRadius());
        

//     }
// }


