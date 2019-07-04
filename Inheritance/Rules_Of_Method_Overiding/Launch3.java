/*
while overriding the method overridden method retrun type can be different provied it is co-verient return type.

co-verient return type are such return type which have "IS_A" relation type.
*/

class Animal
{
	
}

class Tiger extends Animal
{
	
}

class Demo1
{
	public Animal fun()
	{
		System.out.println("ABC");
		Animal a = new Animal();
		return a;
	}
}

class Demo2 extends Demo1{
	public Tiger fun()
	{
		System.out.println("XYZ");
		Tiger t = new Tiger();
		return t;
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