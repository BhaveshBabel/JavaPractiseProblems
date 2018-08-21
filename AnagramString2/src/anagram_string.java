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
	            char[] arr = a.toLowerCase().toCharArray();
	            StringBuilder sb = new StringBuilder(b);
	            int alength = a.length();
	            System.out.println("Length of a : "+alength);
	            for(char ch : arr){
	            	System.out.println(ch);
	                int index = sb.indexOf("" + ch);
	                System.out.println(index);
	                if(index != -1){
	                    sb.deleteCharAt(index);
	                }
	            }
	            value = sb.toString().isEmpty();
	        }
	        return value;
	    }
}
