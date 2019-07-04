class Demo1
{
	void disp1()
	{
		System.out.println("Delhi");
	}
}

class Demo2 extends Demo1
{
	void disp2()
	{
		System.out.println("Rajasthan");
	}
}

class Demo3 extends Demo2
{
			void disp3()
			{
				System.out.println("Bengluru");
			}
}

class Multilevel
{
	public static void main(String []args)
	{
		Demo3 d3 = new Demo3();
		d3.disp1();
		d3.disp2();
		d3.disp3();
	}
}