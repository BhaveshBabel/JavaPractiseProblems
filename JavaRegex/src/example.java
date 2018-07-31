import java.util.regex.*;

public class example {
	public static void main(String arg[]) {
//	(1)	Pattern p = Pattern.compile(".s.");  //implies only 3 characters should be in string
//		Matcher m = p.matcher("asc");
//		Boolean b = m.matches();
//		System.out.println(b);
		Pattern p =  Pattern.compile("[ABC][a-z]{7}");
		Matcher m = p.matcher("Abhavesh");
		Boolean b = m.matches();
		System.out.println(b);
	}
}
