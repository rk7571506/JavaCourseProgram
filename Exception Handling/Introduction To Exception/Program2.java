/*
		Case1: when Exception is Not Occured.
			I/P:
			connection is established.
			Enter The Numerator Value:
			100
			Enter The Denominator Value:
			10
			
			O/P:
		
			10
			Connection is terminated.	
		
		Case2: when Exception is  Occured.
			I/P:
			connection is established.
			Enter The Numerator Value:
			100
			Enter The Denominator Value:
			0
			
			O/P:
			Plz,Provides Non-Zero Denominator
			Connection is terminated.
			
*/

import java.util.*;

class Program2
{
			public static void main(String []args)
			{
				System.out.println("connection is established.");
				
				Scanner sc = new Scanner(System.in);
				try
				{
					System.out.println("Enter The Numerator Value:");
					int a = sc.nextInt();
					
					System.out.println("Enter The Denominator Value:");
					int b = sc.nextInt();
					
					int c = a/b;
					
					System.out.println(c);
				}
				catch(Exception e)
				{
					System.out.println("Plz,Provides Non-Zero Denominator");
				}
				System.out.println("Connection is terminated.");
			}
}