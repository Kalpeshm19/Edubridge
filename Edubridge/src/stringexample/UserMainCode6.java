package stringexample;

import java.util.Scanner;

public class UserMainCode6 {

	public static String negativeString(String stng)
	{
		String newstring = "";
		  int l = stng.length();
		  for(int i = 0; i < l; i++)
		  {
		    if(i-1 >= 0 && Character.isLetter(stng.charAt(i-1))|| i+2 < l && Character.isLetter(stng.charAt(i+2))) 
			{
		      newstring += stng.charAt(i);
		    }
		    else if(i+1 < l && stng.substring(i, i+2).equals("is")) 
			{
		      newstring += "is not";
		      i++;
		    }
		    else newstring += stng.charAt(i);
		  }
		  return newstring;
	}
	
}
