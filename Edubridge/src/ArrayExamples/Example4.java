package ArrayExamples;
import java.util.Scanner;
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String sentence;
		int Vcount=0,Ccount=0;
		
		System.out.println("Enter the sentence::");
		sentence=sc.nextLine();
		
		for(int i=0;i<sentence.length();i++)
		{
			if(sentence.charAt(i)=='a'||sentence.charAt(i)=='e'||sentence.charAt(i)=='i'||sentence.charAt(i)=='o'||sentence.charAt(i)=='u')
				{
					Vcount++;
				}
			else if(sentence.charAt(i)>'a'&& sentence.charAt(i)>'z'||sentence.charAt(i)>'A'&&sentence.charAt(i)>'Z')
			{
				Ccount++;
			}
		}
		System.out.println("Vowels in the sentence is::"+Vcount);
		System.out.println("Vowels in the sentence is::"+Ccount);
		
	}

}
