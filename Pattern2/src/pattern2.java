// pattern for inverted right angled triangle.
//*****
//****
//***
//**
//*
import java.util.Scanner; 
public class pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No of Rows : ");
		int rows = sc.nextInt();
		int i, j;
		for(i = 0; i < rows; i++) {
			for(j = rows-1; j >= i; j--) {
				
				//printing the stars
				System.out.print("* ");
			}
			//dropping line after each row completes
			System.out.println();
		}
		sc.close();
	}
}
