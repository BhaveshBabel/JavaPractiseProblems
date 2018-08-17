import java.util.Scanner;
public class number_pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		int num;
		System.out.println("Enter No of Rows : ");
		int row = sc.nextInt();
		for(i = 0; i < row; i++) {
			num = 1;
			for(j = 0; j <= i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		sc.close();
	}
}
