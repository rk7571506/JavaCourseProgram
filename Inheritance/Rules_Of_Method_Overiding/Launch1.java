class Demo1
{
	public void fun()
	{
		System.out.println("ABC");
	}
}

class Demo2 extends Demo1
{
	public void fun()
	{
		System.out.println("XYZ");
	}
}

class Launch1
{
	public static void main(String []args)
	{
		Demo2 d2 = new Demo2();
		d2.fun();
	}
}