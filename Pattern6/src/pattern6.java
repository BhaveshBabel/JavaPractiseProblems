// mirrored inverted right angled triangle.

//******
// *****
//  ****
//   ***
//    **
//     *

import java.util.Scanner;
public class pattern6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j, k;
		System.out.println("Enter No of Rows : ");
		int row = sc.nextInt();
		for(i = 0; i < row; i++) {
			for(j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(k = i; k < row ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
