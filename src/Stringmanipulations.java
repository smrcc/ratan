
public class Stringmanipulations {

	public static void main(String[] args) 
	{
		String s="mahesh";  //immutable
		s.concat("babu");
		System.out.println(s);
		
		//concat method used to combine two objects it will return new string object
		String s1="mahesh";
		String ss=s1.concat("babu");
		System.out.println(ss);
		
		
		StringBuffer sb=new StringBuffer("mahesh");  //mutable
		sb.append("babu");
		System.out.println(sb); 
		
		
		
		//interview question
		String str="mahesh";  //new object is created internally with same reference 
		//existing object link is destroyed and new object is created with maheshbabu
		str=str.concat("babu");
		System.out.println(str);

	}

}
