
public class Test2 {

	public static void main(String[] args) 
	{
		String s="mahesh";  //converting string to stringbuffer
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		System.out.println(sb.reverse());
		
		StringBuffer sb1=new StringBuffer("mahesh"); //converting stringbuffer to string
		String ss=sb1.toString();
		System.out.println(ss);

	}

}
