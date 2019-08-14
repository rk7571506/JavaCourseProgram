//How To Achive CustomException program3

import java.util.*;

class UnderAgeException extends Exception
{
	public String getMessage()
	{
		return "You are too young Have Patience!";
	}
}

class OverAgeException extends Exception
{
	public String getMessage()
	{
		return "You are too old cool down!";
	}
}

class TakeInput
{
	int age;
	
	void acceptInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your age");
		age = sc.nextInt();
	}
	
	void verifyAge() throws Exception
	{
		if(age<18){
			UnderAgeException uae = new UnderAgeException();
			throw uae;
		}else if(age>65){
			OverAgeException ove = new OverAgeException();
			throw ove;
			
		}else if(age>=18 && age<=65){
			System.out.println("You Have Apply For Driving Licence:");
		}
	}
}

class Program3
{
	public static void main(String []args)
	{
			TakeInput ti = new TakeInput();
			
			try
			{
				ti.acceptInput();
				ti.verifyAge();
			}catch(Exception e){
				System.out.println("Message: "+e.getMessage());
			}
	}
}