import java.util.Scanner;
import java.util.regex.*;

public class patternCheck {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of testcases : ");
		int testcases = Integer.parseInt(sc.nextLine());
		while(testcases > 0) {
			System.out.println("Enter Pattern : ");
			String pattern = sc.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Your pattern "+pattern+" is Valid");
			}
			catch(PatternSyntaxException e) {
				System.out.println("Your pattern "+pattern+" is Invalid");
			}
			testcases--;
		}
		sc.close();
	}
}
