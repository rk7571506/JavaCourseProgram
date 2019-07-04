class Demo1
{
	int a = 99;
	
	void printName()
	{
		System.out.println("Ravi Ranjan");
	}
}
class Demo2 extends Demo1
{
	int a = 9999;
	void printName()
	{
		System.out.println("Pooja Kumari");
	}
	
	void disp()
	{
		System.out.println(a); //9999
		System.out.println(this.a); //9999
		System.out.println(super.a); //99
		printName(); // Pooja Kumari
		this.printName();  //Pooja Kuamri 
		super.printName(); // Ravi Ranjan
		
	}
}

class Super
{
	public static void main(String []args)
	{
		Demo2 d2  = new Demo2();
		d2.disp();
		
	}
}