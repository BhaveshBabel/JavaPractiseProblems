import java.util.Scanner;
public class add {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int size;
		int i,j;
		System.out.println("Enter Rows'n'Columns of Matrix : ");
		size  = sc.nextInt();
		int mat1[][] = new int[size][size];
		int mat2[][] = new int[size][size];
		int mat3[][] = new int[size][size];
		System.out.println("Enter First Matrix = ");
		for(i = 0; i < size; i++) {
			for(j = 0; j < size; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter Second Matrix = ");
		for(i = 0; i < size; i++) {
			for(j = 0; j < size; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		//Addition of Mat1 and Mat2 
		for(i = 0; i < size; i++) {
			for(j = 0; j < size; j++) {
				mat3[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		System.out.println("Matrix Addition Result = ");
		for(i = 0; i < size; i++) {
			for(j = 0; j < size; j++) {
				System.out.print(" "+mat3[i][j]);
			}
			System.out.print("\n");
		}
}
}