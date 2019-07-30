/*Output :-
			O/P is expected but it is single thread program. It means easy time t1 start First alwasys them t2 and then t3.
*/
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

class  LaunchBathroom_Problem3
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
			
			t1.start();
			t1.join();

			
			t2.start();
			t2.join();

			
			t3.start();
			t3.join();
	}
}
