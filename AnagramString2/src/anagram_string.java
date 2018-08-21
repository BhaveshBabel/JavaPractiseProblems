import java.util.Scanner;
public class anagram_string {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Strings To Check : ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		Boolean res = isAnagram(s1,s2);
		System.out.println((res) ? "Anagrams"  : "Not anagrams");
		sc.close();
	} 
	
	 static boolean isAnagram(String a, String b) {
	        Boolean value = false;
	        if(a != null && b!= null && a.length() == b.length()){
	        	
	        	// converting string 'a' to array
	            char[] arr = a.toLowerCase().toCharArray();
	            StringBuilder sb = new StringBuilder(b);
	            int alength = a.length();
	            System.out.println("Length of String 'a' : "+alength);
	            for(char ch : arr){
	            	System.out.println(ch);
	                int index = sb.indexOf("" + ch);
	                if(index != -1){
	                	// deleting character from string 'b' if matches with character in array
	                    sb.deleteCharAt(index);
	                }
	                System.out.println("string b : "+sb);
	            }
	            value = sb.toString().isEmpty();
	        }
	        return value;
	    }
}
