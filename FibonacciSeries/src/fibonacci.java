import java.util.Scanner;
class fibonacci {
	public static void main(String arg[]) {
	Scanner sc = new Scanner(System.in);
	int n1=0, n2=1, n3, len;
	int i;
	System.out.println("Enter Range = ");
	len = sc.nextInt();
	System.out.print(n1 +" "+n2);
	for(i = 2; i < len; i++) {
		if(len > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" "+n3);
		}
	}
}
}
