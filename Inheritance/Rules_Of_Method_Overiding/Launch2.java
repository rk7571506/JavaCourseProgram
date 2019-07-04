/*
while overriding the method return type cannot be changed.
*/
class Demo1
{
	public void fun()
	{
		System.out.println("ABC");
	}
}

class Demo2 extends Demo1{
	public int fun()
	{
		System.out.println("XYZ"); //error!
		return 0;
	}
}

class Launch2
{
	public static void main(String []args)
	{
		Demo2 d2 = new Demo2();
		d2.fun();
	}
}