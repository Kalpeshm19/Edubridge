package stringexample;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		int i,len ;
				
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String::");
		 s=scanner.next();

		
		System.out.println("Enter the Starting index of given string you want to substring  it from::");
		i=scanner.nextInt();

		
		

		System.out.println("Enter the length::");
		len=scanner.nextInt();
		
		System.out.println("Your Entered::"+s+" "+i+" "+len);
		
		String result=UserMainCode1.reverseSubstring(s, i, len);
		
	}

}
