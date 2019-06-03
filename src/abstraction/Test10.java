package abstraction;

public abstract class Test10 
{
	abstract void m1();
	{
		System.out.println("instance blocks");
	}
	static
	{
		System.out.println("static block");
	}
	Test10(int a)
	{
		System.out.println(10);
		System.out.println("abstract class constructor");
	}

}class Test11 extends Test10
{
	void m1()
	{
		System.out.println("normal method");
	}
	Test11()
	{
	super(0);
	System.out.println("normal class cnstructor");
	}
	public static void main(String args[])
	{
		new Test11().m1();
		new Test11().m1();//static blocks executed only one time
	}
}