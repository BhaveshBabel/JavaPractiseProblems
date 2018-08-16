import java.util.Scanner;
public class countLetterInStr {
	
	public static int letterCount(String str) {
		
		int ltr_count = 0;
		int index = 0;
		while(index < str.length()) {
			if(str.charAt(index) != ' ') {
				ltr_count++;
			}
			index++;
		}
		return ltr_count;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		int ltr_count = letterCount(str);
		System.out.println("Total Letters in given String : "+ltr_count);
		sc.close();
	}
}
