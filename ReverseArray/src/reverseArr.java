public class reverseArr {

	public static void reverse_arr(int ar[], int start, int end) {
		int temp;
		while(start < end) {
			temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
		}
	}
	
	public static void main(String arg[]) {
		int arr[] = {2,3,5,6,7,8,1};
		System.out.print("Your Array : ");
		for(int i : arr) {
			System.out.print(i+" ");
		}
		reverse_arr(arr, 0, 6);
		
		System.out.print("\nReversed Array : ");
		
		for(int j : arr) {
			System.out.print(j+" ");
		}
	}
}
