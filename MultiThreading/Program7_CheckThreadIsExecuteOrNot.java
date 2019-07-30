/*
main Thread is first start and first end. then the other Thread are Start.
			
			isAlive() method Working for wherther a thread is execute or not.

			In this  main thread is start and end first. however the default behaviour of main Thread is unaccepctable 
			in such program where main Thread would allocated the resources and other
			Thread  must use the resources
			In such case main Thread should wait for the other Thread to complete their execution.
			it is possible to making the
			join() method.

*/

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
				
				Thread.sleep(2000);

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

					Thread.sleep(2000);
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
						Thread.sleep(2000);
				}
				System.out.println("Character Printing Completed.");
			}
			catch (Exception e)
			{
					System.out.println("Exception is Handled.");
			}
				
		}
}

class  Program7_CheckThreadIsExecuteOrNot
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Execution is Start");
			Demo1 d1 = new Demo1();
			Demo2 d2 = new Demo2();
			Demo3 d3 = new Demo3();

			System.out.println(d1.isAlive());
			System.out.println(d2.isAlive());
			System.out.println(d3.isAlive());

			d1.start();
			d2.start();
			d3.start();

			
			System.out.println(d1.isAlive());
			System.out.println(d2.isAlive());
			System.out.println(d3.isAlive());

			System.out.println("Main Method Is Exexution Is Complete");
	}
}
