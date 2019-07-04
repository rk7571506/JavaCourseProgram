class Plane
{
	void takeOff()
	{
		System.out.println("Plane is taking off.");
		
	}
	
	void fly()
	{
		System.out.println("Plane is flying.");
	}
	
	void land()
	{
		System.out.println("Plane is landing.");
	}
}

class CargoPlane extends Plane
{
	void takeOff()
	{
		System.out.println("CargoPlane is taking off form long sized runaway.");
	}
	
	void fly()
	{
		System.out.println("CargoPlane is flying at lower height.");
	}
	
	void land()
	{
		System.out.println("Cargoplane is landing on long sized runaway.");
	}
}

class PassangerPlane extends Plane
{
	void takeOff()
	{
		System.out.println("PassangerPlane is taking off from medium sized runaway.");
	}
	
	void fly()
	{
		System.out.println("PassangerPlane is flying on medium height.");
	}
	
	void land()
	{
		System.out.println("PassangerPlane is landing on medium land sized runaway.");
	}
}

class FighterPlane extends Plane
{
	void takeOff()
	{
		System.out.println("FighterPlane is taking off from short sized runaway.");
	}
	
	void fly()
	{
		System.out.println("FighterPlane is flying at greatest height.");
	}
	
	void land()
	{
		System.out.println("FighterPlane is landing on short land sized runaway.");
	}
}

class PolymorphismNoCodeReduction
{
	public static void main(String ...args)
	{
		CargoPlane cp = new CargoPlane();
		
		PassangerPlane pp = new PassangerPlane();
		
		FighterPlane fp = new FighterPlane();
		
		Plane ref;
		
		System.out.println("=====Inside CargoPlane=====");
		ref = cp;
		ref.takeOff();
		ref.fly();
		ref.land();
		
		System.out.println("=====Inside PassangerPlane=====");
		ref = pp;
		ref.takeOff();
		ref.fly();
		ref.land();
		
		System.out.println("=====Inside FighterPlane=====");
		ref = fp;
		ref.takeOff();
		ref.fly();
		ref.land();
	}
}