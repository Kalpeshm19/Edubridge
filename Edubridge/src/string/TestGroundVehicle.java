package string;

public class TestGroundVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		GroundVehicle obj=new Car("Number plate is there");
		
		obj.Drive();
		Car car1=(Car)obj;
		
		car1.ponderEthicalDilemma();
		
		
		
		Truck t=new Truck(800.90);
		t.loadCargo();
		t.Drive();
		
		
		
		
		
		
	}

}
