import java.util.Scanner;
public class LinSearch {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int size;
		int i;
		System.out.println("Enter Size : ");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter Elements : ");
		for(i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int num;
		System.out.println("Enter Element To Search : ");
		num = sc.nextInt();
		for(i = 0; i < size; i++) {
			if(arr[i] == num) {
				System.out.println("Element Found at Position "+(i+1));
			}
			else {
				System.out.println("Element not found in given array");
			}
			}
	}

}
