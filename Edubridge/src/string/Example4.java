package string;
import java.util.Scanner;
public class Example4 {

	public static void main(String[]args)
	{
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		
		String str="Kalpesh Mahajan";
		char find='a';
		
		
		for( int i=0; i<str.length(); i++)
		  {
		      if(str.charAt(i) ==find)
		      count++;
		  }
		  
		  System.out.println("The Character '"+find+"' appears "+count+" times.");
		  
	}
		
		
	
}

