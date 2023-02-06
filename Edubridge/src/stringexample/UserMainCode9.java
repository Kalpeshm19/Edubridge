package stringexample;

public class UserMainCode9 {
	
	public static int wordCount(String str,String word)
	{
		String a[]=str.split(" ");
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(word.equals(a[i]))
			{
				count++;
			}
		}
		return count;
		
	}

}
