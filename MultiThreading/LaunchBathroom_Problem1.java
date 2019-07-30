/*How To Resolve Bathroom Problem.*/
import java.util.*;
class Bathroom implements Runnable
{
		public void run(){
		try{
				System.out.println(Thread.currentThread().getName()+" : is entering the bathroom.");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+" : is Using the bathroom.");
				Thread.sleep(3000);
				System.out.println(Thread.currentThread().getName()+" : is Exited the bathroom.");
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				System.out.println("Exception Handled.");
			}
		}
}

class  LaunchBathroom_Problem1
{
	public static void main(String[] args) throws Exception
	{
			Bathroom b = new Bathroom();
			Thread t1 = new Thread(b);
			Thread t2 = new Thread(b);
			Thread t3 = new Thread(b);

			t1.setName("BOY");
			t2.setName("GIRL");
			t3.setName("OTHERS");
			
			
			t1.join();
			t2.join();
			t3.join();

			t1.start();
			t2.start();
			t3.start();

	}
}
