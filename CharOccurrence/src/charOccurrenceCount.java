import java.util.Scanner;

public class charOccurrenceCount {
	static final int  MAX_CHAR = 256;
	public static void countCharOccurrence(String str) {
		  // Create an array of size 256 i.e. ASCII_SIZE
        int count[] = new int[MAX_CHAR];
 
        int len = str.length();
 
        // Initialize count array index
        
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++;
            //System.out.println(count[str.charAt(i)]);
        }
        // Creating an array of given String size
        char ch[] = new char[str.length()];
        
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {
 
                // If any matches found
                if (str.charAt(i) == ch[j]) 
                    find++;                
            }
 
            if (find == 1) { 
                System.out.println("Occurrence of " +
                 str.charAt(i) + " is:" + count[str.charAt(i)]);
            }
        }
	}
	
	
	public static void main(String[] argss) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		countCharOccurrence(str);
		sc.close();
	}
}
