//Program Without Custome Exceptions
import java.util.*;
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
	
	void verifyDetails() 
	{
		if(acc_no == an && password == pw){
			System.out.println("Plz,Collect Your Money!");
		}else
		{
			System.out.println("Invalid credritials");
		}
	}
} 

class Program1
{
	public static void main(String args[])
	{
		ATM a = new ATM();
		a.acceptInput();
		a.verifyDetails();
	}
}