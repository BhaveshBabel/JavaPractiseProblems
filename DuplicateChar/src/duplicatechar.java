import java.util.Scanner;

class duplicatechar {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		char arr[] = str.toCharArray();
//		for(char i:arr) {
//			System.out.println(" "+i);
//		}
		int size = str.length();
		System.out.println("Size = "+size);
		char temp[] = new char[size];
		int length = 0;   
		int i, j=0;
		for(i = 0; i < size-1; i++) {     
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
				System.out.println("Temp Array = "+temp[j-1]);
			}
		}
		temp[j++] = arr[size-1];
		
		length = j;
		for(i = 0; i < length; i++) {
			System.out.print(" "+temp[i]);
		}
		sc.close();
	}
}
