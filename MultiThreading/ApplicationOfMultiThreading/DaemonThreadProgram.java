/*
	Daemon Thread 
*/
class MsWord extends Thread
{
	public void run()
	{
			if (getName().equals("TYPE"))
			{
					typing();
			}
			else if(getName().equals("SPELL"))
			{
				spellCheck();
			}
			else
			{
				autoSave();
			}
	}

	void typing()
	{
			try
			{
				for(int i=1;i<=5;i++)
				{
						System.out.println("Typing...");
						Thread.sleep(3000);
				}
			}
			catch (Exception e)
			{
					System.out.println("Exception Handled...");
			}
	}
	
	void spellCheck()
	{
			try
			{
				for ( ; ; )
				{
					System.out.println("Spellchacking...");
					Thread.sleep(3000);
				}
			}
			catch (Exception e)
			{
					System.out.println("Exception Handled.");
			}
	}

	void autoSave()
	{
		try
		{
			for ( ; ; )
			{
					System.out.println("Autosaving...");
					Thread.sleep(3000);
			}
		}
		catch (Exception e)
		{
			System.out.println("Exception Handled.");
		}
	}
}

class  DaemonThreadProgram
{
	public static void main(String[] args) 
	{
				MsWord ms1 = new MsWord();
				MsWord ms2 = new MsWord();
				MsWord ms3 = new MsWord();


				ms1.setName("TYPE");
				ms2.setName("SPELL");
				ms3.setName("SAVE");


				//1st step  
				ms2.setDaemon(true);
				ms3.setDaemon(true);

				//2nd step   -> set low priority.
				ms2.setPriority(7);
				ms3.setPriority(8);
				


				ms1.start();
				ms2.start();
				ms3.start();


	}
}
