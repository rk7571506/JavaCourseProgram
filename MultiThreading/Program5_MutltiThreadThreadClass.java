/*Multi-Thread program using Thread Class*/

class A extends Thread
{
		public void run()
		{
			for(int i=1;i<=100;++i){
				System.out.println("I Love You!"+i);
				}
		}

}

class B extends Thread
{
		public void run()
		{
			for(int i=1;i<=100;i++){
				System.out.println("I Hate You!"+i);}
		}
}

class  Program5_MutltiThreadThreadClass
{
	public static void main(String[] args) 
	{
			A a1 = new A();
			B b1 = new B();
			a1.start();
			b1.start();
	}
}
