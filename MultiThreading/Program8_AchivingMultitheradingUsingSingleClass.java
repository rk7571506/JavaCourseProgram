/*
		Achiving MultiThreding using Single run() method or single class.
*/

import java.util.*;

class Demo extends Thread
{
		public void run()
		{
				if(getName().equals("BANK"))
				{
					banking();
				}
				else if(getName().equals("NUM"))
				{
					numberPrint();
				}
				else
				{
					charPrint();
				}
		}

		public void banking()
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

		public void numberPrint()
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

		public void charPrint()
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


class  Program8_AchivingMultitheradingUsingSingleClass
{
	public static void main(String[] args) throws Exception
	{
		
			Demo d1 = new Demo();
			Demo d2 = new Demo();
			Demo d3 = new Demo();

			d1.setName("BANK");
			d2.setName("NUM");
			d3.setName("CHAR");
			
			d1.start();
			d2.start();
			d3.start();

		
	}
}
