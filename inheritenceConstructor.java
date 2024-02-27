
// // class Parent 
// // {
// //     public Parent(){   // constructor
// //         System.out.println("parent constructor");

// //     }
// // }

// // class Child extends Parent{
// //     public Child(){

// //         System.out.println("child Constructor");

// //     }
// // }

// // public class inheritenceConstructor{      
// //     public static void main(String[] args){
// //      // Parent  p = new Parent();                 // when we created the obj of class the constructor of the that class is called;

// //       Child  c = new Child();    // when we call the obj of child class then   constructor of parent  class is also called;
// //     }   
// // }




class Parent 
{
    public Parent(){   // constructor
        System.out.println("parent constructor");

    }
}

class Child extends Parent{
    public Child(){

        System.out.println("child Constructor");

    }
}

class grandChild extends Child{
    public grandChild(){

        System.out.println("Grandchild Constructor");

    }
}

public class inheritenceConstructor{      
    public static void main(String[] args){
     // Parent  p = new Parent();                 // when we created the obj of class the constructor of the that class is called;

      grandChild  c = new grandChild();    // when we call the obj of child class then   constructor of parent  class is also called;
    }   
}





// class Parent{
//      public Parent(){
//         System.out.println("Non - parameterised of parent");
//     }
//     public Parent(int x){
//         System.out.println("Param of the parents" +x);
//     }
// }


// // class Child extends Parent{
// //     Child(){
// //         System.out.println("Non - param of Child");
// //     }
// //     Child(int y){
// //     System.out.println("Param of the child"); 
// // }


// //     Child(int x , int y){
// //          super(x);
// //        System.out.println("2 param of the child"+y);
// // }
// // }


// // public class inheritenceConstructor{
// //     public static void main(String[] args){
// //        // int s = 10;
// //        // Child c = new Child();
// //         Child c = new Child(10,20);
// //     }
// // }


// class Rectangle{
//     int length;
//     int breadth;
    

//     Rectangle(){
//         length = breadth =1;
//     }

//     Rectangle(int l, int b){
//         length =l; breadth = b;

//     }
// }

// class Cuboid extends Rectangle
// {
//     int height ;
//     Cuboid(){
//         height = 1;
//     }
//     Cuboid(int h){
//         height = h;
//     }

//     Cuboid(int l, int b, int h){
//         super(l,b);
//         height = h;
//     }

//     int volume(){
//         return length * breadth * height ;

//     }
// }

// public class inheritenceConstructor{
//     public static void main(String[] args){
//         Cuboid c = new Cuboid(4, 3, 10);
//         System.out.println("Volume :"+c.volume());
//     }
// }