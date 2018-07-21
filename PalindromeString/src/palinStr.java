import java.util.Scanner;
public class palinStr {
	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Sting : ");
		String str1 = sc.nextLine();
		int size = str1.length();
		char arr1[] = str1.toCharArray();
		int i;
		int j = 0;
		char arr2[] = new char[size];
		for(i = size-1; i > 0; i--) {
			arr2[j++] = arr1[i];
		}
		arr2[j] = arr1[0];
		String str2 = new String(arr2);
		System.out.println(str2);
		Boolean b = (str2.equals(str1));
		if(b) {
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}
}
