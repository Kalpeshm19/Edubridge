package stringexample;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter First String::");
		 String str1=scanner.next();
		 
		 System.out.println("Enter Second String::");
		 String str2=scanner.next();
		 
		 System.out.println("New String Form::"+UserMainCode3.getCombo(str1, str2));
		 
	}

}
