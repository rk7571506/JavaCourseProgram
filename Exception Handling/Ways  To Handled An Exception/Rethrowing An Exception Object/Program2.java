import java.util.*;

class Demo
{
	void alpha() throws ArrayIndexOutOfBoundsException
	{	
		System.out.println("Connection2 is estd.");
			try
			{
				int c = 3/0;
			}
			catch (ArithmeticException e)
			{
				 System.out.println("Arithmetic Exception is Hanlded.");
				 ArrayIndexOutOfBoundsException  a = new ArrayIndexOutOfBoundsException();
				 throw a;
			}
			catch(Exception g)
			{
				System.out.println("Exceptiom is Handled.");
			}
		finally
		{
			System.out.println("Connection2 is terminated.");
		}
	}
}


class Program2 
{
	public static void main(String[] args)  
	{

		System.out.println("Connection1 is estd.");
	try
		{
			Demo d = new Demo();
			d.alpha();	
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
			System.out.println("ArrayIndexOutOfBoundsException is Handled.");
	}

		finally
		{
		System.out.println("Connection1 is terminated.");
		}
	}
}
