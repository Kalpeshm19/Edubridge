package string;
import java.util.Scanner;
public class Example3 {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first string");
		String str1=sc.nextLine();
		
		System.out.println("Enter the second string");
		String str2=sc.nextLine();
		
		int result=str1.compareTo(str2);
		 if (result < 0)
	        {
	            System.out.println("\"" + str1 + "\"" +
	                " is less than " +
	                "\"" + str2 + "\"");
	        }
	        else if (result == 0)
	        {
	            System.out.println("\"" + str1 + "\"" +
	                " is equal to " +
	                "\"" + str2 + "\"");
	        }
	        else // if (result > 0)
	        {
	            System.out.println("\"" + str1 + "\"" +
	                " is greater than " +
	                "\"" + str2 + "\"");
	        }
		
		
		
	}

}
