/*Multi-Thread program using Runnable inteface.*/

class A implements Runnable
{
		public void run()
		{
			for(int i=1;i<=100;++i){
				System.out.println("I Love You!"+i);
				}
		}

}

class B implements Runnable
{
		public void run()
		{
			for(int i=1;i<=100;i++){
				System.out.println("I Hate You!"+i);}
		}
}

class  Program4_MutltiThreadRunnable
{
	public static void main(String[] args) 
	{
			Thread t1 = new Thread(new A());
			Thread t2 = new Thread(new B());

			t1.start();
			t2.start();
	}
}
