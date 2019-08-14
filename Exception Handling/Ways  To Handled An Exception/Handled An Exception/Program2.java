class Demo
{
	void alpha()
	{
		System.out.println("conn2 is estd.");
			try
			{
				ArithmeticException o = new ArithmeticException();
				throw  o;
			}
			catch (ArithmeticException e)
			{
				System.out.println("Exception1 is Handled.");	
			}
			catch(Exception e)
			{
				System.out.println("Exception Handled.");
			}

			System.out.println("Conn2 is terminated.");
	}
}

class  Program2
{
	public static void main(String[] args) 
	{
		System.out.println("connection1 is estd.");
		Demo d = new Demo();
		d.alpha();
		System.out.println("connection1 is terminated.");
	}
}
