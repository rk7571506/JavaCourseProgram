/*synchronized Block*/
class Warrior extends Thread
{
		String res1 = "Brahmastra";
		String res2 = "Sarpastra.";
		String res3  = "Pashup";

		public void run()
		{
				if(getName().equals("RAMA"))
				{
						ramaAccRes();
				}
				else
				{
					ravanaAccRes();
				}
		}

		void ramaAccRes()
		{
			try
			{
				synchronized(res1)
				{
					System.out.println("Rama has accquried."+res1);
					Thread.sleep(3000);
					
					synchronized(res2)
						{
							System.out.println("Rama has accquried."+res2);
							Thread.sleep(3000);
					}
					synchronized(res3)
					{
						System.out.println("Rama has accquried."+res3);
						Thread.sleep(3000);
					}

				}
			}
			catch (Exception e)
			{
				System.out.println("Exception Hanlded.");
			}
		}

		void ravanaAccRes()
		{
			try
			{
				synchronized(res1)
				{
					System.out.println("Ravana has accquried."+res1);
					Thread.sleep(3000);
					
					synchronized(res2)
						{
							System.out.println("Ravana has accquried."+res2);
							Thread.sleep(3000);
					}
					synchronized(res3)
					{
						System.out.println("Ravana has accquried. "+res3);
						Thread.sleep(3000);
					}
				}
			}
			catch (Exception e)
			{
				System.out.println("Exception Hanlded.");
			}
		}
}

class	SynchroizedUsed  
{
	public static void main(String[] args) 
	{
		Warrior w1 = new Warrior();
		Warrior w2 = new Warrior();

		 w1.setName("RAMA");
		 w2.setName("RAVANA");

		 w1.start();
		 w2.start();
	}
}
