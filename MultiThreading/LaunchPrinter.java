/*Using MultiThreading Program Printer Application*/

class Printer implements Runnable
{
	synchronized	public void run()
	{
		try
		{
			System.out.println(Thread.currentThread().getName()+" : Program Printing Command Execute.");
			Thread.sleep(3000);

			System.out.println(Thread.currentThread().getName()+" : Program Printing Under Execution.");
			Thread.sleep(3000);

			System.out.println(Thread.currentThread().getName()+" : Program Printing Successfully.");
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			System.out.println("Exception Handled.");
		}
			
	}

}


class  LaunchPrinter
{
	public static void main(String[] args) 
	{
	

		/*	Printer t1 = new Printer();
			Printer t2 = new Printer();
			Printer t3= new Printer(); */

/*  when implements Runnable. */
			Printer p = new Printer();

			Thread t1 = new Thread(p);
			Thread t2 = new Thread(p);
			Thread t3 = new Thread(p); 


			t1.setName("C");
			t2.setName("C++");
			t3.setName("JAVA");

			t1.start();
			t2.start();
			t3.start();
	}
}
