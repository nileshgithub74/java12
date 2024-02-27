// class circle{
//     public double radius;
//     public double area(){
//         return Math.PI* radius* radius;
//     }

//     public double perimeter(){
//         return 2*Math.PI*radius;

//     }
//     public double Circumference(){
//         return perimeter();
//     }
// }


// public class inheritence {
    
// }


class Animal{
     String name;
      public void eat(){
        System.out.println("I can eat");
      }

}

class Dog extends Animal{
    public void display(){
        System.out.println("Name :"+name);
    }
}

public class inheritence{
    public static void main(String[] args){
        Dog d   = new Dog();

        d.name  = "tom";
        d.display();
        d.eat();
    }
}