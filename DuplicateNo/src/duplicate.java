import java.util.Scanner;
class duplicate {
	public static void main(String arg[]) {
	Scanner sc = new Scanner(System.in);
	int size,length=0;
	int i;
	System.out.println("Enter Array Size : ");
	size = sc.nextInt();
	int arr[] = new int[size];
	System.out.println("Enter Array = ");
	for(i = 0; i < size; i++) {
		arr[i] = sc.nextInt();
	}
	int temp[] = new int[size];
	 if (size==0 || size==1){  
         length = size;  
     }    
	 int j = 0;
     for ( i=0; i < size-1; i++){  
         if (arr[i] != arr[i+1]){  
             temp[j++] = arr[i];  
         }  
      }  
     temp[j++] = arr[size-1];        
     // Changing original array  
     for (i=0; i < j; i++){  
         arr[i] = temp[i];  
     }
     length = j; 
     System.out.println("New Array = ");
     for(i = 0; i < length; i++) {
    	 System.out.print(arr[i]+" ");
     }
 }  
}