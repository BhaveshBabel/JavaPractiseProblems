import java.util.Scanner;
public class bubbleSort {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int size;
		int i,j,temp;
		System.out.println("Enter Size Of Array : ");
		size = sc.nextInt();
		int arry[] = new int[size];
		System.out.println("Enter Elements to Sort : ");
		for(i = 0; i < size; i++) {
			arry[i] = sc.nextInt();
		}
		for(i = 0; i < size-1; i++) {
			for(j = i+1; j < size; j++) {
				if(arry[i] > arry[j]) {
					temp = arry[i];
					arry[i] = arry[j];
					arry[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array : ");
		for(i = 0; i < size; i++) {
			System.out.println(arry[i]);
		}
	}
}
