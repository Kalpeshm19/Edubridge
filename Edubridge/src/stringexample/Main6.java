package stringexample;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
	      String str1;
	      System.out.println("Enter the string::");
	      str1=sc.nextLine();
	      System.out.println("The given string is: "+str1);
	      
		System.out.println("The new string is: "+UserMainCode6.negativeString(str1));

	}

}
