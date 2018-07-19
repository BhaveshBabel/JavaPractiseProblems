import java.util.Scanner;
class Num {
	
	public static void main(String[] arg) {
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		int num = b;
		int rev = 0;
		while(b != 0) {
			rev = rev*10;
			rev = rev + b%10;
			b = b/10;
		}
		if(num == rev )
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
