import java.util.Scanner;
//import java.util.regex.*;
	class UsernameValidator {
	    public static final String regularExpression = "[a-z A-Z][a-z A-Z_0-9]{7,29}";
	}
public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
    	System.out.println("Enter Number of Inputs : ");
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}

