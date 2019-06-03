package collections;

import java.util.Arrays;

public class Test6 {

	public static void main(String[] args) 
	{
		int[] num= {1,2,3,4,5};
		
		int l=num[0];
		int s=num[0];
		
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>l)
			{
				l=num[i];
			}
			else if(num[i]<s)
			{
				s=num[i];
			}
		}
		System.out.println(Arrays.toString(num));
		
	}
	

}
