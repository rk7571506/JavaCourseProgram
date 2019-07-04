/*Polymorphism Version But Not invoke the child specialized Method.*/
class Parent
{
	void cry()
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
	void eat()
	{
		System.out.println("child1 eats less food.");
	}
}

class Child2 extends Parent
{
	void cry()
	{
			System.out.println("child2 cries at Medium voice.");
	}
	
	void eat()
	{
		System.out.println("child2 eats sufficient food.");
	}
} 

class Child3 extends Parent
{
	void cry()
	{
			System.out.println("child3 cries at Louder Voice.");
	}
	
	void eat()
	{
		System.out.println("child3 eats extra food.");
	}
}

class Polymorphism1
{
	public static void main(String ...args)
	{
		Parent ref; //Lose Coupling
		
		Child1 c1 = new Child1();
		
		Child2 c2 = new Child2();
		
		Child3 c3 = new Child3();
		
		ref = c1; //Upcasting 
		ref.cry(); 
		ref.eat(); //error
		
		ref = c2; //Upcasting
		ref.cry(); 
		ref.eat(); //error
		
		ref = c3;  // Upcasting
		ref.cry();
		ref.eat(); //error
		// 1 : 3
	}
}