package abstraction;

public abstract  class Test
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	void m4()
	{
		System.out.println("normal method");
	}
	Test()
	{
		System.out.println("default constructor");
	}
	
}
class Test1 extends Test
{	
	

	

	@Override
	void m1() {
		System.out.println("m1 method");
		
	}

	@Override
	void m2() {
	System.out.println("m2 method");
		
	}

	@Override
	void m3() {
		System.out.println("m3 method");
		
	}
	public static void main(String args[])
	{
		Test1 t=new Test1();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
	}
	
}