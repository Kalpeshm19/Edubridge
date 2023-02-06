package string;
import java.util.*;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String[] fruits={"Banana","Graphes","Mango","Kiwi","Strawberry","Apple"};
		
		
		System.out.println("Original unsorted fruits::");
		for (String c:fruits) {
			

			System.out.print("{"+c+"}");
		}
		System.out.println();
		Arrays.sort(fruits);
		System.out.println("Ascending order fruits::"+Arrays.toString(fruits));
		
		Arrays.sort(fruits,Collections.reverseOrder());
		
		System.out.println("Decending Order fruits::"+Arrays.toString(fruits));
	}

}
