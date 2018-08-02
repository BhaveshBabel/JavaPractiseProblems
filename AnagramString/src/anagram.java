import java.util.Arrays;
import java.util.Scanner;

public class anagram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Strings To Check : ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		//checkforAnagram(s1, s2);
		Boolean res = isAnagram(s1,s2);
		System.out.println((res) ? "Anagrams"  : "Not anagrams");
	} 
//	public static void checkforAnagram(String a, String b) {
//		String a1 = a.replaceAll("\\s", "");
//		String b1 = b.replaceAll("\\s", "");
//		Boolean value = false;
//		if(a1.length() != b1.length()) {
//			value = false;
//		}
//		else {
//			//converting both the strings to array.
//			
//			char[] a1array = a1.toLowerCase().toCharArray();
//			char[] b1array = b1.toLowerCase().toCharArray();
//			Arrays.sort(a1array);
//			System.out.println(a1array);
//			Arrays.sort(b1array);
//			System.out.println(b1array);
//			value = Arrays.equals(a1array, b1array);
//			
//			if(value) {
//				System.out.println("String is Anagram");
//			}
//			else {
//				System.out.println("String is not Anagram");
//			}
//		}
//	}
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
