package stringexample;

public class UserMainCode3 {
	
	public static String getCombo(String str1,String str2)
	{
		StringBuffer sb=new StringBuffer();
		
		
		int first=str1.length();
		int second=str2.length();
		
		if(first>second)
		{
			sb.append(str1).append(str2).append(str1);
		}
		else
		{
			sb.append(str2).append(str1).append(str1);
		}
		return sb.toString();
		
	}
}
