/*
	Disadvantage of Single Threaded Apporach.
*/

import java.util.*;

class Program3 
{
	public static void main(String[] args) throws Exception
	{
		
		Scanner scan = new Scanner(System.in);
		/*Tesk-1*/
		System.out.println("Banking Activity Started.");
		System.out.println("Enter The Account Number.");
		int an = scan.nextInt();
		System.out.println("Enter The Password.");
		int pw = scan.nextInt();
		Thread.sleep(3000); //3 sec  //InterruptedException -> for this ducking the exception.
		System.out.println("Collect Your Money.");
		System.out.println("Banking Activity Completed.");

		/*Task-2*/
		System.out.println("Number Printing Started.");
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(3000);
		}
		System.out.println("Number Printing Completed.");
		
		/*Task-3*/
		System.out.println("Character/String Printing Started.");

		for(int i=1;i<=5;i++)
		{
			System.out.println("Ravi Ranjan");
			Thread.sleep(3000);
		}
		System.out.println("Character/String Printing Completed.");

	}
}
