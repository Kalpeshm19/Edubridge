package ArrayExamples;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {4,5,2,5,12,34,78,90,22,45};
		int even_sum=0,odd_sum=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]%2==0)
			{
				even_sum=even_sum+array[i];
			}
			else
			{
				odd_sum=odd_sum+array[i];
			}
		}
		
		System.out.println("Sum of even numbers::"+even_sum);
		System.out.println("Sum of odd numbers::"+odd_sum);
	}

}
