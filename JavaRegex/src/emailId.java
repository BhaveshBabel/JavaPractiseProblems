import java.util.regex.*;
import java.util.Scanner;
public class emailId {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		//Pattern p = Pattern.compile("\\w*.");
		//Pattern p = Pattern.compile("[\\w\\.-_]+@([\\w\\-]+\\.)+[a-z]{2,4}");
		Pattern p = Pattern.compile("[a-z 0-9 ._-]{3,}+@+[a-z]{3,}+\\.+[a-z]{3,}");
		System.out.print("Enter EmailId to Check : ");
		String s = sc.nextLine();
		//Matcher m = p.matcher("abc-9_bca@gmail.com");
		Matcher m = p.matcher(s);
		Boolean b = m.matches();
		System.out.println(b);
	}
}
