import java.util.Scanner;

public class number_pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j;
		System.out.print("Ënter No of Rows : ");
		int row = sc.nextInt();
		int num = 1;
		for(i = 0; i < row; i++) {
			for(j = 0; j <= i; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		sc.close();
	}
}
