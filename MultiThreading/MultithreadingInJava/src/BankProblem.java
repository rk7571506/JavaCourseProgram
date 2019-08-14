import java.util.Scanner;

class Account
{
	private int bal;
	public Account(int bal)
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

class Customer implements Runnable
{
	private String name;
	private Account account;
	
	public Customer(Account account, String name)
	{
		this.account = account;
		this.name = name;
	}
	
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(name+" "+"Enter The Amount to Withdraw:");
		int amt = sc.nextInt();
		
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

public class BankProblem {
		public static void main(String[] args) {
			Account first  = new Account(1000);
			Customer c1 = new Customer(first, "Ravi Ranjan");
			Customer c2 = new Customer(first, "Vinod Kumar Singh");
			
			Thread t1 = new Thread(c1);
			Thread t2 = new Thread(c2);
			
			t1.start();
			t2.start();
		}
}
