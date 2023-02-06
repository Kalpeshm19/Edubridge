package stringexample;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Sentence::");
		String str=sc.nextLine();
		
		System.out.println("Enter the word you want to check occurence::");
		String word=sc.next();
		System.out.println(UserMainCode9.wordCount(str, word));
		
	}

}
