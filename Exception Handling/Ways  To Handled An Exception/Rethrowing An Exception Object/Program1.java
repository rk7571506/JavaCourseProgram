import java.util.*;

class Demo
{
	 void alpha() throws Exception
	{
		  System.out.println("Connection2 is estd."); 
		  Scanner sc = new Scanner(System.in);
		  try{
		  System.out.println("Enter The Numerator");
		  int a = sc.nextInt();
		  System.out.println("Enter The Denominator");
		  int b = sc.nextInt();

		  int c = a/b;
		  System.out.println(c);
		  }
		  catch(Exception e)
		{
				System.out.println("Exception is Handled in alpha() method.");  
				throw e;
		  }

		  finally
		{
				System.out.println("Connection2 is terminated.");
		} 	
	}
}


class Program1 
{
	public static void main(String[] args) 
	{
		System.out.println("Connection1 is estd");
		try
		{
			Demo d = new Demo();
			d.alpha();	
		}
		catch (Exception e)
		{
			System.out.println("Exception is Handled In main() method.");
		}
		
		finally
		{
				System.out.println("Connection1 is terminated.");
		}
	}
}
