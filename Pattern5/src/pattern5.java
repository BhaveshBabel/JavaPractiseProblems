//  Mirrored right triangle pattern.
//     *
//    **
//   ***
//  ****
// *****

import java.util.Scanner;
public class pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k;
		System.out.println("Enter No of Rows : ");
		int rows = sc.nextInt();
		for(i = 0; i < rows; i++) {
			for(j = i; j < rows-1 ; j++) {
				//Print spaces in decreasing order of row
				System.out.print(" ");
			}
			for(k = 0; k <= i ; k++) {
				//Print star in increasing order or row
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}

