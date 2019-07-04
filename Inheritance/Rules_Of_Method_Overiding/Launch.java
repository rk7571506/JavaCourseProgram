/*
When a parent class method overridden In a child class,then the overridden method should maintance either the same
accessibility or more accessibility. However decreasing the accessibility in overridden method is not permitted.
*/
class Demo1
{
	public void fun()
	{
		System.out.println("ABC");
	}
}

class Demo2 extends Demo1{
	void fun() //error!
	{
		System.out.println("XYZ"); 
	}
}

class Launch
{
	public static void main(String []args)
	{
		Demo2 d2 = new Demo2();
		d2.fun();
	}
}