
public class Test1 {

	public static void main(String[] args) 
	{
		Test1 t=new Test1();
		System.out.println(t);//whenever calling reference variable it is internally calling tostring method.
		//first it will check if your class contains tostring method or not.suppose if your class not contains 
		//tostring method object class tostring executed it will give classname@hashcode as output
		String s="mahesh";
		System.out.println(s);
		System.out.println(s.toString());//string class overriding object class tostring method
		//it will return content of string object
		
		StringBuffer sb=new StringBuffer("mahesh");//sb also overdiding tostring
		System.out.println(sb);
		System.out.println(sb.toString());

		

	}

}
