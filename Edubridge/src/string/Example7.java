package string;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			  Scanner sc= new Scanner(System.in);
			      String myString;
			      System.out.println("Enter the string::");
			      myString=sc.next();
			      
			      StringBuffer buffer = new StringBuffer(myString);
			      buffer.reverse();
			      String data = buffer.toString();
			      if(myString.equals(data)){
			         System.out.println("Given String is palindrome");
			      } else {
			         System.out.println("Given String is not palindrome");
			      }
			   	
	}

}
