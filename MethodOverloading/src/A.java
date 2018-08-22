 class A {
	int x,y;
	float a,b;
	int sum(int x, int y) {
		return(x+y);
	}
	float sum(float a, float b) {
		return(a+b);
	}
	public static void main(String arg[]){
		A obj = new A();
		System.out.println(obj.sum(10, 20));
		System.out.println(obj.sum((float)10.5, (float)20.1));
		obj.main();
	}
	public void main(){
		A obj = new A();
		System.out.println("In Main : ");
		System.out.println(obj.sum(10, 20));
		System.out.println(obj.sum((float)10.5, (float)20.1));
	}

}
