package Learning;

class A{
	
	public void show() {
		System.out.println("this is in A");
	}
}

public class AnonymousClass {
	public static void main(String[]args) {
			
			A objA=new A(){
				
						public void show(){
					
							System.out.println("this is me anonymous class");
					
						}
			};
			objA.show();
	}
}



