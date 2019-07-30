class Program2 
{
	public static void main(String[] args) 
	{
		Thread t = Thread.currentThread();
		t.setName("Ravi");
		t.setPriority(3);
		System.out.println(t);
	}
}
