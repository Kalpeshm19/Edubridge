package string;

import java.util.Scanner;

public class Example5 {
	
	public static void main(String[]args) {
		
		
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number to repeat the string::");
		int n=sc.nextInt();

		String str = "India";

		

		String result = "";

		for(int i=0; i<n; i++)

		{

			result = result + str;

		}

		System.out.println(result);
		
	}
}


