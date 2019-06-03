package collections;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) 
	{
		//arrays are type safety
		
		int [] a= {10,20,30};
		for(int aa:a)
		{
			System.out.println(aa);
		}
		
//collections are not type safe
		
		ArrayList al=new ArrayList();
		al.add(new Emp(436, "mahesh"));
		al.add(new Student(36, "babu"));
		
		for(Object o:al)
		{
			if(o instanceof Emp)
			{
				Emp e=(Emp)o;
				System.out.println(e.eid+" "+e.ename);
			}
			if(o instanceof Student)
			{
				Student s=(Student)o;
				System.out.println(s.sid+" "+s.sname);
			}
		}
		Object oo=al.get(1);
		if(oo instanceof Emp)
		{
			Emp e=(Emp)oo;
			System.out.println(e.eid+" "+e.ename);
		}if(oo instanceof Student)
		{
			Student s=(Student)oo;
			System.out.println(s.sid+" "+s.sname);
		}
		//provide type safety o collections use generics
		ArrayList<Emp> a2=new ArrayList<Emp>();
		a2.add(new Emp(36, "mahesh"));
		a2.add(new Emp(436, "babu"));
		for(Emp e:a2)
		{
			System.out.println(e.eid+" "+e.ename);
		}
		Emp e=a2.get(1);
		System.out.println(e.eid+" "+e.ename);
		
	}

}
