
public class StringEqualsMethod 
{
	StringEqualsMethod(String str){}

	public static void main(String[] args) 
	{
		//object class equals():reference comparison
		StringEqualsMethod m1=new StringEqualsMethod("mahesh");
		StringEqualsMethod m2=new StringEqualsMethod("mahesh");
		System.out.println(m1.equals(m2)); //false
		System.out.println(m1==m2);//false
		
		//string class overriding equals()---content comparison
		String s1="mahesh";
		String s2="mahesh";
		System.out.println(s1.equals(s2));//true
		System.out.println(s1==s2);//true
		
		String str=new String("mahesh");  //content comparison 
		String str1=new String("mahesh");
		System.out.println(str1.equals(str));//true
		System.out.println(str==str1);//false
		
		
		StringBuffer sb=new StringBuffer("mahesh"); //reference comparison
		StringBuffer sb1=new StringBuffer("mahesh");
		System.out.println(sb.equals(sb1));//false
		System.out.println(sb==sb1);//false

	}

}
