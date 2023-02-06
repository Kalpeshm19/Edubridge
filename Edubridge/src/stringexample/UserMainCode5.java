package stringexample;

import java.util.Scanner;

public class UserMainCode5 {
	
	public static String  getSpecialChar(String str)
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter the string::");
		str=sc.next();
		String resultstr="";  
		//loop execute till the length of the string   
		for (int i=0;i<str.length();i++)  
		{  
		 
		if ((str.charAt(i)<'a'||str.charAt(i)>'z')&&(str.charAt(i)<'A'||str.charAt(i)>'Z'))
		{  
		
		resultstr=resultstr+str.charAt(i);  
		}  
	}  
		return resultstr;
	}  

}
