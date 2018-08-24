// java methods within an interface are implicitly public and abstract

interface interface_ex {
	final int i = 10;
	// public and abstract methods
	public void show();
	public void show1();

}
interface i1{
	public void show2();
}
interface i2{
	public void show2();
}
class Test implements i1,i2,interface_ex{
	
	public void show() {
		System.out.println("In Show");
	}
	public void show1() {
		System.out.println("In Show1");
	}
	public void show2() {
		System.out.println("In Show2");
	}
	public static void main(String arg[]) {
		Test obj = new Test();
		obj.show();
	    obj.show1();
	    obj.show2();
		System.out.println(i); 
	}
}
