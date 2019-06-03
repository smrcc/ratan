
public class Emp1 
{
	int id;
	String name;
	
	Emp1(String name,int id)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()//string class toString method executed it will return content of string 
	{
		return "Empid :"+id+" Empname :"+ name;
		
	}
	public static void main(String args[])
	{
		Emp1 e=new Emp1("mahesh", 436);
		System.out.println(e);
		System.out.println(e.toString());
	}

}
