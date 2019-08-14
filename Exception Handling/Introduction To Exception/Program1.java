//How To an Exception Occur In A program
/*
			Program When Exception is occured giving the faulty Input:
*/
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
			Exception in thread "main" java.lang.ArithmeticException: / by zero
			at Program1.main(Program1.java:22)
			
*/

import java.util.*;

class Program1
{
			public static void main(String []args)
			{
				System.out.println("connection is established.");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter The Numerator Value:");
				int a = sc.nextInt();
				
				System.out.println("Enter The Denominator Value:");
				int b = sc.nextInt();
				
				int c = a/b;
				
				System.out.println(c);
				System.out.println("Connection is terminated.");
			}
}