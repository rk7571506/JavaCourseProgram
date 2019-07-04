class Plane
{
	void takeOff()
	{
		System.out.println("Plan is taking off.");
	}
	void fly()
	{
		System.out.println("Plane is flying.");
	}
	void land()
	{
			System.out.println("Plane is landing");
	}
}

class CargoPlane extends Plane
{
	void fly()
	{
			System.out.println("CargoPlane is flying at lower heights.");
	}
	
	void carryCargo()
	{
			System.out.println("Cargo Plane is Carrying Cargo.");
	}
}

class PassangerPlane extends Plane
{
	void fly()
	{
			System.out.println("PassangerPlane is flying at Medium heights.");
	}
	
	void carryPassanger()
	{
			System.out.println("Passanger Plane is Carrying Passanger.");
	}
}

class FighterPlane extends Plane{
	void fly()
	{
			System.out.println("Fighter Plane is Flying at greater Heights");
	}
	
	void carryWeapons()
	{
			System.out.println("Fighter Plane is Carrying Weapons");
	}
}

class Program1
{
	public static void main(String []args)
	{
		CargoPlane cp = new CargoPlane();
		
		PassangerPlane pp = new PassangerPlane();
		
		FighterPlane fp = new FighterPlane();
		
			System.out.println("=======Inside CargoPlane======");
			cp.takeOff();
			cp.fly();
			cp.land();
			cp.carryCargo();
			
			System.out.println("=====Inside PassangerPlane=====");
			pp.takeOff();
			pp.fly();
			pp.land();
			pp.carryPassanger();
			
			System.out.println("=====Inside FighterPlane");
			fp.takeOff();
			fp.fly();
			fp.land();
			fp.carryWeapons();
				
	}
}

