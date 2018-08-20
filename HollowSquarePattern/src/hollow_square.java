// hollow square pattern(row * row pattern)

import java.util.Scanner;
public class hollow_square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Rows : ");
		int row = sc.nextInt();
		int i, j;
		for(i = 0; i < row; i++) 
		{
			for(j = 0; j < row; j++) 
			{
				if(i == 0 || i == (row-1) || j == 0 || j == (row-1)) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
