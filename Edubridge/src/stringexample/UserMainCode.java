
	package stringexample;

	import java.util.Scanner;

	public class UserMainCode {
		
		

		static String formString()
		{
			Scanner sc = new Scanner(System.in);
		int len=sc.nextInt();
		String[]array=new String[len]; 
		for(int j=0;j<len;j++)
		{
			array[j]=sc.next();
			
		}
		int number=sc.nextInt()-1;
		String empty="";
		for(int i=0;i<len;i++)
		{
			if(array[i].length()>number)
			{
				empty=empty+array[i].charAt(number);
			}
			else
			{
				empty=empty+"$";
			}
		
		}
		return empty;
		
		
		}
	}
		
		
		
		
		
		



