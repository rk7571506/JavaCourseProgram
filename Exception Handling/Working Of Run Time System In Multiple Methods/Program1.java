
import java.util.*;

class Demo
{
	 void alpha()
	{
			System.out.println("Connection 2 is establish.");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Numerator");
			int a = sc.nextInt();

			System.out.println("Enter Denominator");

			int b = sc.nextInt();

			int c = a/b;
				System.out.println(c);
			System.out.println("Connection 2 is terminated.");
	}
}

class Program1 
{
	public static void main(String[] args) 
	{
			System.out.println("Connection1 is establish.");

			Demo d = new Demo();
			d.alpha();

			System.out.println("Connection1 is terminated.");
	}
}
