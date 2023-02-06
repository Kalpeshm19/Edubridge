package stringexample;

import java.util.Scanner;
import java.util.StringTokenizer;

public class UserMainCode8 {

	
	public static String printCapitalized(String str) {
		
		StringBuffer sb=new StringBuffer();
		StringTokenizer st=new StringTokenizer(str," ");
		
		while(st.hasMoreTokens())
		{
			String s2=st.nextToken();
			String s3=s2.substring(0,1);
			String s4=s2.substring(1,s2.length());
			sb.append(s3.toUpperCase()).append(s4).append(" ");
		}
		return sb.toString();
		
		
	
		
	}
}

