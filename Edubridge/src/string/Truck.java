package string;

public class Truck extends GroundVehicle {
	
	public double capacity;

	public Truck(double capacity) {
		super();
		this.capacity = capacity;
		System.out.println("capacity of cargos::"+capacity);
	}
	@Override
	public void Drive()
	{
		super.Drive();
		System.out.println("Truck is moving");
	}
	
	public void loadCargo()
	{
		
		System.out.println("Cargo is loaded:: ");
		
		
	}
	

}
