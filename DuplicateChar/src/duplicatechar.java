//import java.util.Scanner;
class duplicatechar {
	public static void main(String arg[]) {
		//Scanner sc = new Scanner(System.in);
		String str = "aabbcaef";
		char arr[] = str.toCharArray();
//		for(char i:arr) {
//			System.out.println(" "+i);
//		}
		int size = str.length();
		System.out.println("size = "+size);
		char temp[] = new char[size];
		int length = 0;   
		int i,j=0;
		for(i = 0; i < size-1; i++) {     
			if(arr[i] != arr[i+1]) {
				temp[j++] = arr[i];
				System.out.println("temp="+temp[j-1]);
			}
			
		}
		temp[j++] = arr[size-1];
		
//		for(i = 0; i < j; i++) {
//			arr[i] = temp[i];
//		}
		length = j;
		for(i = 0; i < length; i++) {
			System.out.print(" "+temp[i]);
		}
}
}
