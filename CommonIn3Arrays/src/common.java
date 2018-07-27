public class common {
	public static void find_smallest(int[] ar1, int[] ar2, int[] ar3, int temp[]) {
		int i=0, j=0, k=0, l=0;
		while(i<ar1.length && j<ar2.length && k<ar3.length) {
			if(ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
				temp[i] = ar1[i];
				System.out.print(temp[i]);
				i++;
				j++;
				k++;
			}
			else if(ar1[i] < ar2[j]) {
				i++;
			}
			else if(ar2[j] < ar3[k] ) {
				j++;
			}
			else {
				k++;
			}
		}
}
	
	public static void main(String args[]) {
		int arr1[] = {2,3,1,4};
		int arr2[] = {1,2,3,5,6};
		int arr3[] = {3,4,6,7,8,1};
		int temp[] = new int[30];
		//int newarr[] = new int[30];
		find_smallest(arr1, arr2, arr3, temp);
		}
}
