
class Demo
{
	  void alpha() throws Exception
		{
				System.out.println("Connection2 is Estd.");

				int c  = 3/0;

				System.out.println(c);

				System.out.println("Connection2 is terminated.");
	  }
}


class Ducking 
{
	public static void main(String[] args) 
	{
		System.out.println("Connection1  is estd.");
		try
		{
				Demo d1 = new Demo();
				d1.alpha();
	
		}
		catch (Exception e)
		{
				System.out.println("Exception is Handled In main() method.");
		}
		
		System.out.println("Connection1 is terminated.");
	}
}
