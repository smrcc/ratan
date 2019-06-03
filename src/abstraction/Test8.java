package abstraction;

public  abstract class Test8 
{
	abstract void m1();
	Test8()
	{
		System.out.println("abstract class constructor");
	}

}
class Test9 extends Test8
{
	void m1()
	{
		System.out.println("normal method");
	}
	Test9( )
	{super();
		
		System.out.println("normal class constructor");
	}
	public static void main(String args[])
	{
		new Test9().m1();
	}
}