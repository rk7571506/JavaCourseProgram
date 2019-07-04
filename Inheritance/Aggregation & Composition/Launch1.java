class Heart
{
	int heartbeat;
	int weight;
	
	public Heart(int heartbeat,int weight)
	{
		this.heartbeat = heartbeat;
		this.weight = weight;
	}
	
	public int getHeartBeat()
	{
		return heartbeat;
	}
	
	public int getWeight()
	{
		return weight;
	}
}

class Brain
{
	String color;
	int weight;
	
	public Brain(String color , int weight)
	{
		this.color = color;
		this.weight = weight;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public int getWeight()
	{
		return weight;
	}
}

class Bike
{
	String brand;
	int mileage;
	
	public Bike(String brand , int mileage)
	{
		this.brand = brand;
		this.mileage = mileage;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public int getMileage()
	{
		return mileage;
	}
}

class Book1
{
	String author;
	int price;
	
	public Book1(String author , int price)
	{
		this.author = author;
		this.price = price;
	}
	
	public String getAuthor()
	{
		return author;
	}
	
	public int getPrice()
	{
		return price;
	}
}

class Student
{
	Heart h = new Heart(72,310);
	Brain b = new Brain("grey",1000);
	
	void hasA(Bike bi){
		System.out.println(bi.getBrand());
		System.out.println(bi.getMileage());
	}
	void hasA(Book1 bo)
	{
		System.out.println(bo.getAuthor());
		System.out.println(bo.getPrice());
	}
}

class Launch1
{
	public static void main(String ...args)
	{
		Student s = new Student();
		
		Bike bi = new Bike("KTM",20);
		
		Book1 bo = new Book1("Ravi Ranjan",505);
		
		System.out.println(s.h.getHeartBeat());
		
		System.out.println(s.h.getWeight());
		
		System.out.println(s.b.getColor());
		
		System.out.println(s.b.getWeight());
		
		s.hasA(bi);
		
		s.hasA(bo);
		
		s = null;
	/*	
	  RuntimeErrorException(NullPointerException)
	  
		System.out.println(s.h.getHeartBeat());
		
		System.out.println(s.h.getWeight());
		
		System.out.println(s.b.getColor());
		
		System.out.println(s.b.getWeight());
		
		s.hasA(bi);
		
		s.hasA(bo);
	*/
	     System.out.println("==========");
		System.out.println(bi.getBrand());
		System.out.println(bi.getMileage());
		System.out.println(bo.getAuthor());
		System.out.println(bo.getPrice());
		
		
		
	}
}


