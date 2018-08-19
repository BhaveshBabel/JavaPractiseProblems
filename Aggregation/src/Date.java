import java.util.Scanner;
public class Date {
	int dd,mm,yy;
	void setDate(int d, int m, int y) {
		dd = d;
		mm = m;
		yy = y;
	}
	void showDate() {
		System.out.println(dd+"/"+mm+"/"+yy);
	}
}
class Person{
	int id;
	String name;
	// creating Date class object
	Date d ;
	void setData(int i, String n, int d1, int m, int y) {
		id = i;
		name = n;
		d = new Date();
		d.setDate(d1,m,y);
	}
	void printInfo() {
		System.out.println("ID = "+id);
		System.out.println("NAME = "+name);
		d.showDate();
	}
}
class Final{
	public static void main(String arg[]) {
		int I,D,M,Y;
		String N;
		Scanner sc = new Scanner(System.in);
		System.out.println("Id = ");
		I = sc.nextInt();
		System.out.println("Name = ");
		N = sc.next();
		System.out.println("Date = ");
		D = sc.nextInt();
		System.out.println("Month = ");
		M = sc.nextInt();
		System.out.println("Year = ");
		Y = sc.nextInt();
		// creating object of class Person
		Person p = new Person();
		// setting the values by calling setData method of class Person
		p.setData(I, N, D, M, Y);
		p.printInfo();
		
		sc.close();
	}
}
