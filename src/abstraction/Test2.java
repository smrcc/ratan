package abstraction;

public  abstract class Test2 
{
	abstract void m1();
	abstract void m3();
	abstract void m2();
	abstract void m4();

}
abstract class  Test3 extends Test2
{
	void m1() {System.out.println("m1 method");}
}
abstract class Test4 extends Test3
{
	void m2() {System.out.println("m2 method");}
}
abstract class Test5 extends Test4
{
	void m3() {System.out.println("m3 method");}
}class Test6 extends Test5
{
	void m4() {System.out.println("m4 method");}

public static void main(String args[])
{
	Test2 t=new Test6();
	t.m1();
	t.m2();
	t.m3();
	t.m4();
}
}