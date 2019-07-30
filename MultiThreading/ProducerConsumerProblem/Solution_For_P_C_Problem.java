
class Queue1
{
		int x;
		boolean value_present_in_x = false;

		synchronized void put(int j) 
		{
			try{
				if(value_present_in_x == true)
				{
						wait();
				}else
				{
							x = j;
						 System.out.println("i have put x : "+x);
						 notify();
						value_present_in_x = true;
				}
			}catch(Exception e)
			{
					System.out.println("Exception is Handled.");
			}
		}

		synchronized void get() 
		{
				try{
						if(value_present_in_x == false)
						{
								wait();
						}else
						{
								System.out.println("I have taken from x :"+x);
								notify();
								value_present_in_x = false;
						}
				}catch(Exception e)
				{
					System.out.println("Exception is Handled.");
				}
		}
}

class Producer extends Thread
{
		Queue1 a;

		public Producer(Queue1 q)
		{
			a = q;
		}

		public void run()
		{
			int i = 1;
			while(true)
			{
				a.put(i++);
			}
		}
}

class Consumer extends Thread
{
		Queue1 b;

		public Consumer(Queue1 q)
		{
			b = q;
		}

		public void run()
		{
			while(true)
			{
				b.get();
			}
		}
}
class Solution_For_P_C_Problem 
{
	public static void main(String[] args) 
	{
			Queue1 q = new Queue1(); //oridanary Object
			Producer p = new Producer(q); // Thread Object
			Consumer c = new Consumer(q); //Thread Object

				p.start();
				c.start();

	}
}
