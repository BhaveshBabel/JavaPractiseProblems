// hollow rectangle pattern( row * column pattern)
import java.util.Scanner;
public class hollow_rect {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows : ");
		int row = sc.nextInt();
		System.out.println("Enter Columns : ");
		int column = sc.nextInt();
		int i, j;
		for(i = 0; i < row; i++) {
			for(j = 0; j < column; j++) {
				if(i == 0 || i == (row-1) || j == 0 || j == (column-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
