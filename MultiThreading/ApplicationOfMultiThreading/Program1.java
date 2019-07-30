/*
	Application of multi threading & why multiThreading
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
				for ( int i=1;i<=5;i++ )
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
			for ( int i=1;i<=5;i++ )
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

class  Program1
{
	public static void main(String[] args) 
	{
				MsWord ms1 = new MsWord();
				MsWord ms2 = new MsWord();
				MsWord ms3 = new MsWord();


				ms1.setName("TYPE");
				ms2.setName("SPELL");
				ms3.setName("SAVE");


				ms1.start();
				ms2.start();
				ms3.start();


	}
}
