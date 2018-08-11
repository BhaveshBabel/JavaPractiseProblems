//right angled pattern

//	*
//	**
//	***
//	****
//	*****

import java.util.Scanner;
public class pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of Rows : ");
		int row = sc.nextInt();
		int i, j;
		for(i = 0; i < row; i++) {
			for(j = 0; j <= i; j++) {
				// printing the stars
				System.out.print("* ");
			}
			// dropping line after each row
			System.out.println();
		}
		sc.close();
	}
}
