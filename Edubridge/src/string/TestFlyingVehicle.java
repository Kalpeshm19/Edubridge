package string;

public class TestFlyingVehicle {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FlyingVehicle obj1=new Spaceship(true);
		
		obj1.fly();
		obj1.land();
		obj1=new Airplane(300);
		obj1.fly();
		obj1.land();
		
	}

}
