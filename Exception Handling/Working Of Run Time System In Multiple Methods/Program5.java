import java.util.*;

class Demo1
{
	void gamma()
	{
		System.out.println("Connection4 is estd.");
		Scanner sc = new Scanner(System.in);
		
				System.out.println("Enter The Numerator");
				int a = sc.nextInt();

				System.out.println("Enter The Denomenator.");
				int b = sc.nextInt();

				int c = a/b;

				System.out.println(c);

			System.out.println("Connection4 is terminated.");
	}
}

class Demo2
{			
		
			void beta()
			{
					
						System.out.println("Connection3 is estd.");
						Demo1 d1 =  new Demo1();
						d1.gamma();
						System.out.println("Exception Handled in Demo2");
						System.out.println("Connection3 is terminated");	
			}
			
}

class Demo3
{
	void alpha()
	{
		try
		{
				System.out.println("Connection2 is estd.");
				Demo2 d2 =  new Demo2();
				d2.beta();
		}
		catch(Exception e)
		{
				System.out.println("Exception Handled in Demo3");
		}
		 System.out.println("Connection2  is terminated.");
	}
}

class Program5
{
	public static void main(String[] args) 
	{
		System.out.println("Connection1 is estd.");
			Demo3 d3 = new Demo3();	
			d3.alpha();
			System.out.println("Connection1 is terminated.");

	}
}
