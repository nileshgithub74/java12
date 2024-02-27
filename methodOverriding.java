class Super{

    public void display(){
        System.out.println("Super class Display");
    }
}

class Sub extends Super{
    public void display(){
        System.out.println("Sub class Display");
    }
}

public class methodOverriding{
    public static void main(String[] args){
        // Super sup = new Super();
        // sup.display();
        Sub sub = new Sub();
        sub.display();
    }
}



