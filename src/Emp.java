
public class Emp 
{
	int empid;
	String name;
	Emp(int empid,String name)
	{
		this.name=name;
		this.empid=empid;
	}

	public static void main(String[] args) 
	{
		Emp e=new Emp(111,"mahesh");
		System.out.println(e);
		System.out.println(e.toString());//if object class tostring executed it will give classname@hashcode
		

	}

}
