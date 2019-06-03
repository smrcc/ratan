package collections;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(new Emp(436, "mahesh"));
		al.add(new Student(36, "babu"));
		al.add(10);
		al.add("appala");
		al.add(null);
		//System.out.println(al.toString()); classname @hashcode
		
		for(Object o:al)
		{
			if( o instanceof Emp )
			{
				 Emp e=(Emp)o;
				 System.out.println(e.eid+" "+e.ename);
			}
			if(o instanceof Student)
			{
				Student s=(Student)o;
				System.out.println(s.sid+" "+s.sname);
			}
			if(o instanceof Integer)
			{
				System.out.println(o);
			}
			if(o instanceof String)
			{
				System.out.println(o);
			}
			if(o==null)
			{
				System.out.println(o);
			}
		}
		
		

	}

}
