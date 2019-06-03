package collections;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(new Emp(436, "mahesh"));
		al.add(new Student(36, "babu"));
		 Student s=(Student)al.get(1);// not recommended
		 System.out.println(s.sid+" "+s.sname);
		 
		 
		  Object o=al.get(0);
		  if(o instanceof Student)
		  {
			 Student s1= (Student)o;
			 System.out.println(s1.sid+" "+s1.sname);
		  }
		  if( o instanceof Emp )
			{
				 Emp e=(Emp)o;
				 System.out.println(e.eid+" "+e.ename);
			}
		

	}

}
