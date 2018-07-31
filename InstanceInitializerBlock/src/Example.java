class Base{
	//int x = 100;
	Base()
	{
		System.out.println("Base Class Constructor");
	}
	//Base class block
	{
		System.out.println("Base Class Block");
	}
}
class child extends Base
{
	child()
	{
		System.out.println("Child Class Constructor");
	}
	// Child class block
	{
		System.out.println("Child Class Block");
	}
}
class Example 
{
	public static void main(String arg[]) 
	{
		Base obj1 = new Base(); //calls base class.
		child obj2 = new child(); //calls constructor of base class first and then execute child class.
	}

}
