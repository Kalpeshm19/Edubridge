package stringexample;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String::");
		String str=sc.next();
		
		System.out.println("Enter the number if you want to repeat the string::");
		int n=sc.nextInt();
		
		System.out.println("New Form String::"+UserMainCode4.repeatString(str, n));
	}
	}


