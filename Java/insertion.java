// import java.util.Scanner;



// public class insertion
// {
//     public static void main(String[] args){
//         int size, loc, item ,i;

//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Array size: "); 
//         size = sc.nextInt();

//         int arr[] = new int[size +1];
//         System.out.println("Enter the Array elements: ");

//         for(i=0; i<size ; i++){
//             arr[i] = sc.nextInt();
//         }

//         System.out.println("Enter the index : ");
//         loc = sc.nextInt();
//         System.out.println("Enter the new item: ");
//         item = sc.nextInt();

//         for( i= size-1; i> loc; i--){

//             arr[i] = arr[i-1];

//         }

//         arr[loc] = item;
//         size++;

//         System.out.println("Array element are: ");

//         for(i=0; i<size; i++){
//             System.out.print(arr[i]+" ");
//         }


//         sc.close();



//     }
// }