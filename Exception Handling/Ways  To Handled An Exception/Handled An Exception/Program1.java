import java.util.*;

class Demo
{
		void alpha()
		{
			System.out.println("Connection2 is estd.");
			
				Scanner sc = new Scanner(System.in);
				try
				{
	
					System.out.println("Enter The Numerator");
					int a = sc.nextInt();

					System.out.println("Enter The Denominator");

					int b = sc.nextInt();

					int c = a/b;

					System.out.println(c);
				}
				catch(Exception e)
				{
					System.out.println("Exception is Handled.");
				}
				System.out.println("Connection2 is  terminated.");

		}

}

class Program1 
{
	public static void main(String[] args) 
	{
			System.out.println("Connection 1 is estd.");

			Demo d1 = new Demo();

			d1.alpha();

			System.out.println("Connection1 is terminated.");
	}
}
