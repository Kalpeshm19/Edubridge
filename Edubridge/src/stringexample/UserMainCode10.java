package stringexample;

public class UserMainCode10 {
	
	public static String moveX(String str)
	{
		String s1 = str.replaceAll("[x]", "");
	    String s2 = str.replaceAll("[^x]", "");
	    
	    
	    return s1+s2;
	}

}
