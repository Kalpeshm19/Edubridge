package ArrayExamples;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String myname="KalpeshMahajan";
		
		for(int i=0;i<myname.length();i++)
		{
			if(Character.isLowerCase(myname.charAt(i)))
			{
				System.out.print(myname.charAt(i));
				
			}
		}
	}

}
