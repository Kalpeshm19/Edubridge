package string;

public class Airplane extends FlyingVehicle {
	
	int passenger;
	
	
	
	
	public Airplane(int passenger) {
		super();
		this.passenger = passenger;
		
		
		System.out.println("Passenger in this plane::"+passenger);
		
	}



	public void fly()
	 {
		super.fly();
		 System.out.println("Airplane is take off");
		
		 
	 }
	 
	 
	 
	 public void land()
	 {
		 super.land();
		 System.out.println("Airplane is land successfully");
		
	 }

}
