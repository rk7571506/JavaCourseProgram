class Os
{
	String name;
	int size;
	
	public Os(String name , int size)
	{
		this.name =  name;
		this.size =  size;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getSize()
	{
		return size;
	}
}

class Charger
{
	String brand;
	
	public Charger(String brand)
	{
		this.brand = brand;
	}
	
	public String getBrand()
	{
		return brand;
	}
}

class Mobile
{
	Os os = new Os("Android",512);
	
	void hasA(Charger c)
	{
		System.out.println(c.getBrand());
	}
}

class Launch
{
	public static void main(String ...args)
	{
		Mobile m = new Mobile();
		Charger c = new Charger("Samsung.");
		
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		m.hasA(c);
		
		m = null;
		
		/*
		Error NullPointerException(RuntimeException)
		
		System.out.println(m.os.getName());
		System.out.println(m.os.getSize());
		m.hasA(c); 
		*/
		
		System.out.println(c.getBrand());
	}
}
