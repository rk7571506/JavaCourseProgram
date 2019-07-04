/*
In java multiple inheritance is not allowed because it leads to dimond shape.

It means one child class cannot extends from multiple parent class. 
*/
//Example Of mutliple inheritance.


class Demo1 extends Object
{
	int a = 99;
}
class Demo2 extends Object
{
	int a = 9999;
}

class Demo3 extends Demo1 , Demo2
{
	void disp()
	{
		System.out.println(a);
	}
}

class Error2
{
	public static void main(String []args)
	{
		Demo3 d3 =  new Demo3();
		d3.disp();
		
	}
}