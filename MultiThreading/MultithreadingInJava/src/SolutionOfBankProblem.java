import java.util.Scanner;

class Account1
{
	private int bal;
	public Account1(int bal)
	{
		this.bal = bal;
	}
	
	public boolean isSufficientBlance(int w)
	{
		if(bal>w)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void withdraw(int amount)
	{
		bal = bal - amount;
		System.out.println("Withdraw money is:"+amount);
		System.out.println("Your Current Balance:"+bal);
	}
}

class Customer1 implements Runnable
{
	private String name;
	private Account1 account;
	
	public Customer1(Account1 account, String name)
	{
		this.account = account;
		this.name = name;
	}
	
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(name+" "+"Enter The Amount to Withdraw:");
		int amt = sc.nextInt();
		synchronized(account)
		{
			if(account.isSufficientBlance(amt))
			{
				System.out.println("Name:"+name);
				account.withdraw(amt);
			}
			else
			{
				System.out.println("Insufficient Balance.");
			}
		}
	}
}

public class SolutionOfBankProblem {
		public static void main(String[] args) {
			Account1 first  = new Account1(1000);
			Customer1 c1 = new Customer1(first, "Ravi Ranjan");
			Customer1 c2 = new Customer1(first, "Vinod Kumar Singh");
			
			Thread t1 = new Thread(c1);
			Thread t2 = new Thread(c2);
			
			t1.start();
			t2.start();
		}
}
