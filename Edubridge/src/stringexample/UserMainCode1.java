package stringexample;

public class UserMainCode1 {
	
	
	public static String reverseSubstring(String str,int sindex,int len)
	{

	

	StringBuilder sb=new StringBuilder();
	sb.append(str);
	sb.reverse();
	
	String result=sb.substring(sindex,sindex+len);
	
	
	System.out.println(result);
	return result;

	}
}

