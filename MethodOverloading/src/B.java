class B {
	int x,y;
	float a,b;
	void sum(float x, float y) {
		System.out.println("In Int Arg Function");
		System.out.print(x+y);
	}
	void sum(long a, long b) {
		System.out.println("In Long Arg function");
		System.out.println(a+b);
	}
	public static void main(String arg[])
	{
		B obj = new B();
		obj.sum(10, 20);
	}
}
