import java.util.Scanner;
public class swap {
	public static void main(String arg[]) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter Strings s1 and s2 : ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		int length1 = s1.length();
		int length2  = s2.length();
		s1 = s1 +" "+ s2;		
		System.out.println(s1);
		s2 = s1;			
		s1 = s1.substring(length1);		
		s2 = s2.substring(0, length1);	
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
	}
}
