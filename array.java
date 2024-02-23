public class array {
    public static void main(String[] args) {
        int[] arr = {1,23, 0, 4,0,4,0 ,32,0};
        int[] a = new int[arr.length];
		
		int j=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] ==0){
				
				a[j]=0;
				
				j++;
				
			}
		}
			
			for (int t=0; t<arr.length; t++){
				
				if(arr[t] !=0){
					
					a[j] = arr[t];
					
					j++;
					
				}
				
			}
			
			System.out.println(a);
		
	}





    }
    
    

