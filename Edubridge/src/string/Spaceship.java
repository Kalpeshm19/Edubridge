package string;

 class Spaceship extends FlyingVehicle {//child class

	 boolean hyperdrive;
	

	 
	  Spaceship(boolean hyperdrive) {
		
		this.hyperdrive = hyperdrive;
		if(hyperdrive==true)
    	{
    		 System.out.println("This speceship hyperdrive is activeted");
    	}
		
	}


    @Override
	public void fly()
	 {
    	super.fly();
    	System.out.println("Spaceship is flying");
    	
		
		 
		 
	 }
	 
	 
	 @Override
	 public void land()
	 {
		 super.land();
		 System.out.println("This is speceship land");
		 
	 }


	}
	

