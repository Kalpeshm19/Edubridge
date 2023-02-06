package stringexample;

public class UserMainCode4 {

	public static String repeatString(String str,int n)
	{
		StringBuffer sb=new StringBuffer();
			for(int i=0;i<n;i++)
			{
				sb.append(str);
			}
			
			return sb.toString();
		
		
		
		
	}

}
