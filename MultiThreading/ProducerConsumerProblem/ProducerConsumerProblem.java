/*ProducerConsumerProblem*/
class Queue1
{
		int x;
		void put(int j)
		{
			 x = j;
			 System.out.println("i have put x : "+x);
		}

		void get()
		{
						 System.out.println("I have taken from x :"+x);
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
class  ProducerConsumerProblem
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
