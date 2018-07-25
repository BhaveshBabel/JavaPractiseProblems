import java.util.Scanner;
public class prime {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int a1,a2;
		int i,j;
		int flag=0;
		//Enter starting range:
		System.out.print("Enter a1 = ");
		a1 = sc.nextInt();
		//Enter ending range:
		System.out.print("Enter a2 = ");
		a2 = sc.nextInt();
		for(i = a1; i <= a2; i++)
		{
			if(i == 2) 
			{
				System.out.println(i);
			}
			for(j = 2; j < i ;j++) 
			{
				if(i % j == 0 )
				{
					flag = 0;
					break;
				}
				else 
				{
					flag = 1;
				}
			}
			if(flag == 1)
			{
				System.out.println(i);
			}
		}
	}
}
