//  interface Member{
//     public void callback();
//  }

//  class Store{
//     Member members[]= new Member[20];

//     int count = 0;
   
//     void register(Member m){
//         members[count++] = m;
//     }
//     void inviteSale(){
//         for(int i =0; i<count; i++){
//             members[i].callback();
//         }
//     }
//  }


//  class Customer implements Member{
//     String name;

//     Customer(String n){
//         name  = n;
//     }
//     public void callback(){
//         System.out.println("Ok , i will come,"+ name);
//     }

//  }




// public class CallBackMethod {
//     public static void main(String[] args) {
//         Store s = new Store();
//         Customer c = new Customer("Ruhi");
//         Customer c2 = new Customer("Nilesh");
//         s.register(c);
//         s.register(c2);
//         s.inviteSale();
//     }
    
// }


// Do and Don's of interface

