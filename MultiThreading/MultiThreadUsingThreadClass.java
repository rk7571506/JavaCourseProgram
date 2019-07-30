/*Multi-threaded Program extends The Thread Class*/

import java.util.*;

class Demo1 extends Thread
{
		public void run()
		{
			try
			{
				System.out.println("Banking activity Start.");
				Scanner scan = new Scanner(System.in);
				System.out.println("EnterAccount No.");
				int an = scan.nextInt();
				System.out.println("Enter Password.");
				int pass = scan.nextInt();
				
				Thread.sleep(5000);

				System.out.println("Banking Activity Completed.");
			}
			catch (Exception e)
			{
					System.out.println("Exception is Handled.");
			}
				
	
		}
}

class Demo2 extends Thread
{
		public void run()
		{
			try
			{
				System.out.println("Number Printing Start");
				for(int i=1;i<=5;i++){
					System.out.println(i);

					Thread.sleep(5000);
				}
				System.out.println("Nuber Printing Completed.");
				
			}
			catch (Exception e)
			{
					System.out.println("Exception is Handled.");
			}
				
		}
}

class Demo3 extends Thread
{
		public void run()
		{
			try
			{
				System.out.println("Character Printing Start");
				
				for(int i=1;i<=5;i++)
				{
						System.out.println("Ravi Ranjan");
						Thread.sleep(5000);
				}
				System.out.println("Character Printing Completed.");
			}
			catch (Exception e)
			{
					System.out.println("Exception is Handled.");
			}
				
		}
}

class  MultiThreadUsingThreadClass
{
	public static void main(String[] args) 
	{
			Demo1 d1 = new Demo1();
			Demo2 d2 = new Demo2();
			Demo3 d3 = new Demo3();

			d1.start();
			d2.start();
			d3.start();
	}
}
