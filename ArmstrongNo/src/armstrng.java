import java.util.Scanner;
import java.lang.Math;
class armstrng {
	public static void main(String arg[]) {
	Scanner sc = new Scanner(System.in);
	int a;
	double res = 0, c = 0;
	int b;
	System.out.println("Enter the number = ");
	a = sc.nextInt();
	int num = a;
	int numb = a;
	//COUNTING DIGITS 
	while(num > 0) {
		num = num / 10;
		c++;
	}
	System.out.println("No of Digits = "+c);
	while(a > 0) {
		b = a % 10;
		res = res + (Math.pow(b,c));
		a = a/10;
	}
	if(res == numb) {
		System.out.println("Number is Armstrong");
	}
	else {
		System.out.println("Not Armstrong");
	}
}
}