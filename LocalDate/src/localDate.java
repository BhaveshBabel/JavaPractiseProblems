import java.util.Scanner;
import java.time.LocalDate;
public class localDate {
	
	public static String getDay( String year, String day, String month) {
		int dd = Integer.parseInt(day);
		int mm = Integer.parseInt(month);
		int yy = Integer.parseInt(year);
		//Inbuilt immutable class
		LocalDate dt = LocalDate.of(yy, mm ,dd);
		return dt.getDayOfWeek().toString();
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter MM : ");
        String month = sc.next();
        System.out.print("Enter DD : ");
        String day = sc.next();
        System.out.print("Enter YYYY : ");
        String year = sc.next();
        
        System.out.println("Day is : "+getDay(year,day, month));
        sc.close();
    }	
}
