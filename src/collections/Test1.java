package collections;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) 
	{
		//after 1.5 automatically autoboxing internally done by compiler
		ArrayList al=new ArrayList();
		al.add(10);

		al.add("mahesh");
		al.add(10);
		al.add(null);
		al.add(10.5);
		al.add('a');
		System.out.println(al);
		//before 1.5 version
		ArrayList al1=new ArrayList();
		al.add(10);

		al.add("mahesh");
		al.add(Integer.valueOf(10));
		al.add(null);
		al.add(Double.valueOf(10.5));
		al.add(Character.valueOf('a'));
		System.out.println(al);
		
		
	}

}
