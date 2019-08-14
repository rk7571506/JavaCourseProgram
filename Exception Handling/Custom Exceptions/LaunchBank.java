
//How To Achive CustomException program2
import java.util.*;

class InvalidCustomerException extends Exception
{
	public String getMessage()
	{
		return "Invaid Credrtails";
	}
}

class ATM
{
	private int acc_no = 2222;
	private int password = 5555;
	int an;
	int pw;
	
	void acceptInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Account Number:");
		an = sc.nextInt();
		
		System.out.println("Enter Your Password:");
		pw = sc.nextInt();
	}
	
	void verifyDetails() throws Exception
	{
		if(acc_no == an && password == pw){
			System.out.println("Plz,Collect Your Money!");
		}else
		{
			InvalidCustomerException icv = new InvalidCustomerException();
			throw icv;
		}
	}
} 

class Bank
{
	ATM a = new ATM();
		
	void insitate()	
	{	
		try
		{
			a.acceptInput();
			a.verifyDetails();
		}catch(Exception e)
		{
			try
			{
				a.acceptInput();
				a.verifyDetails();
			}
			catch(Exception f)
			{
				try
				{
					a.acceptInput();
					a.verifyDetails();
				}
				catch(Exception g)
				{
					System.out.println("Your Card Is Block!");
					System.exit(0);
				}
			}
		}
	}
}

class LaunchBank
{
	public static void main(String []args)
	{
		Bank b = new Bank();
		b.insitate();
		
	}
}