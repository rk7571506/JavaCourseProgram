class Worker
{
			void dust()
			{
				System.out.println("Dushing is in Progress.");
			}
			
			void sweep()
			{
				System.out.println("Sweeping is in Progress.");
			}
			
			void wash()
			{
				System.out.println("Washing is in Progress.");
			}
}

class Supervisior
{
	Worker w = new Worker();
	
	void dust()
	{
		w.dust();
	}
	
	void sweep()
	{
		w.sweep();
	}
	
	void wash()
	{
		w.wash();
	}
}

class Owner{
	public static void main(String []args)
	{
		Supervisior s = new Supervisior();
		
		s.dust();
		
		s.sweep();
		
		s.wash();
	}
}