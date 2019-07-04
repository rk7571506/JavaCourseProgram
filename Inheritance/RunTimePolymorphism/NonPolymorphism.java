class Parent
{
	void cay()
	{
			System.out.println("Parent do no cry.");
	}
}

class Child1 extends Parent
{
	void cry()
	{
			System.out.println("child1 cries at lower voice.");
	}
}

class Child2 extends Parent
{
	void cry()
	{
			System.out.println("child2 cries at Medium voice.");
	}
} 

class Child3 extends Parent
{
	void cry()
	{
			System.out.println("child3 cries at Louder Voice.");
	}
}

class NonPolymorphism
{
	public static void main(String ...args)
	{
		Child1 c1 = new Child1(); //Tight Coupling
		
		Child2 c2 = new Child2(); //Tight Coupling
		
		Child3 c3 = new Child3(); //Tight Coupling
		
		c1.cry(); //1 : 1
		
		c2.cry(); // 1 : 1
		
		c3.cry(); // 1 : 1
		
	}
}