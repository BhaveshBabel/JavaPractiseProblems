//WAP to remove all numbers from a given String.
import java.util.regex.*;
import java.util.Scanner;
public class remove {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		String value = str.replaceAll("[0-9]", "");
		System.out.println(value);
}
}