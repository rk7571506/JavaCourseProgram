class Animal
{
	void eat()
	{
			System.out.println("Animals eat their preferable food.");
	}
	void breathe()
	{
			System.out.println("Animals Live breathing Fresh Air.");
	}
}

class Tiger extends Animal
{
	void eat()
	{
			System.out.println("Tiger lives eating raw fish.");
	}
	
	void foodHabit()
	{
			System.out.println("Tiger is herbivorous.");
	}
}
class Dear extends Animal
{
	void eat()
	{
			System.out.println("Dear Lives eating green Food.");
	}
	
	void foodHabit()
	{
			System.out.println("Dear is cornivorous.");
	}
}
class Monkey extends Animal
{
	void eat()
	{
			System.out.println("Monkey is lives eating bananas.");
	}
	void foodHabit()
	{
			System.out.println("Monkey is omnivorous");
	}
}

class Program2
{
	public static void main(String ...args)
	{
		Tiger t  = new Tiger();
		
		Dear d = new Dear();
		
		Monkey m = new Monkey();
		
			System.out.println("=====Inside Tiger=====");
			t.eat();
			t.breathe();
			t.foodHabit();
			
			System.out.println("=====Inside Dear=====");
			d.eat();
			d.breathe();
			d.foodHabit();
			
			System.out.println("=====Inside Monkey=====");
			m.eat();
			m.breathe();
			m.foodHabit();
	}
}

