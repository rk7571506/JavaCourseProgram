// Rule:1 Private Member of parent class will never participate in inheritance.

class You
{
	private int acc_no;
	private int password;
	
	public You()
	{
		acc_no = 2222;
		password = 5555;
	}
}
class Friend extends You
{
	void notify()
	{
		acc_no = 9999;
		password = 7777;
	}
	
	void disp()
	{
		System.out.println(acc_no);
		System.out.println(password);
	}
}

class Error1
{
	public static void main(String []args)
	{
		Friend f  = new Friend();
		f.notify();
		f.disp();
	}
}