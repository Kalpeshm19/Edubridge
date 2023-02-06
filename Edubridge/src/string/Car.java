package string;

public class Car extends GroundVehicle {
	
	public String noPlates;

	public Car(String noPlates) {
		super();
		this.noPlates = noPlates;
	}
	@Override
	public void Drive()
	{
		super.Drive();
		System.out.println("Car is moving");
	}
	
	public String ponderEthicalDilemma()
	{
		System.out.println("number plates::"+noPlates);
		
		return noPlates.toString();
	}

}
