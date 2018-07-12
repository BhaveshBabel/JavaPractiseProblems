import java.util.Scanner;
public class DecToBin {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		int num, rem, base = 1, bin = 0;
		System.out.println("Enetr Decimal No. = ");
		num = sc.nextInt();
		while(num > 0) {
			rem = num % 2;
			bin = bin + rem*base;
			num = num/2;
			base = base*10;
		}
		System.out.println("Equivalent Binary No. = "+bin);
	}
}
