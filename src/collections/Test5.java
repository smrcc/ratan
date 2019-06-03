package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Test5 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(100);
		al.add(1000);
		
		ArrayList a1=new ArrayList(al);
		a1.add(1);
		System.out.println(a1);

	}

}
