public class smallest {
	public static void find_smallest(int ar1[], int ar2[], int ar3[]) {
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < ar1.length && j < ar2.length && k < ar3.length) {
			if(ar1[i] == ar2[j] && ar2[j] == ar3[k]) {
				System.out.print(ar1[i]+" ");
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
		//smallest ob = new smallest();
		int ar1[] = {1,2,4,5,6,7};
		int ar2[] = {2,4,5,6,7,8};
		int ar3[] = {2,4,6,8,9,10,12};
		System.out.print("Common Elements : ");
		find_smallest(ar1, ar2, ar3);
		}
}
