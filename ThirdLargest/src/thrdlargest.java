import java.util.Scanner;
public class thrdlargest {
	public static void main(String arg[]) {
	Scanner sc = new Scanner(System.in);
	int size;
	int i,j,temp;
	System.out.println("Enter Size of Array : ");
	size = sc.nextInt();
	int arry[] = new int[size];
	System.out.println("Enter Array : ");
	for(i = 0; i < size; i++) {
		arry[i] = sc.nextInt();
	}
	for(i = 0; i < size; i++) {
		for(j = i+1; j < size; j++) {
			if(arry[i] > arry[j]) {
				temp = arry[i];
				arry[i] = arry[j];
				arry[j] = temp;
			}
		}
	}
	System.out.print("Sorted Array : ");
	for(int i1 : arry) {
		System.out.print(i1+" ");
	}
	System.out.println("\nThird Largest Number = "+arry[size-3]);
	sc.close();
}
}