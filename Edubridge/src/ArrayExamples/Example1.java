package ArrayExamples;

import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num1= {10,20,30,50,5};
		
		
		int[] num2={10,20,45,50,5};
		
		 int result[] = new int[5]; 
		 
		 for (int i=0; i<result.length; i++) {
		      // add array elements
		      result[i] = num1[i] + num2[i];
		    }
		 
		 System.out.println("Result is::" +Arrays.toString(result));
		
		
	}

}
