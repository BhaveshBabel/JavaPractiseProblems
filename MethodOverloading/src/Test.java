//import java.util.Scanner;

class Test {
	int x,y;
	float a,b;
	int sum(int x, int y) {
		return(x+y);
	}
	float sum(float a, float b) {
		return(a+b);
	}
	public static void main(String arg[]){
		Test obj = new Test();
		System.out.println(obj.sum(20, 20));
		System.out.println(obj.sum((float)10.5, (float)30.1));
	}
}
