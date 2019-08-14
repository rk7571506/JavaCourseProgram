/*
Advantage of multiple catch block.
*/

import java.util.*;

class Program5_AdvantageOfmultipleCatchBlock
{
	public static void main(String[] args) 
	{

		System.out.println("Connection is Estlibished.");
		Scanner scan = new Scanner(System.in);
		try{

					System.out.println("Enter a numerator");
					int a = scan.nextInt();
					System.out.println("Enter a denominator");
					int b = scan.nextInt();

					int c = a/b;
					System.out.println(c);

					System.out.println("Enter the size of an array");
					int size = scan.nextInt();
					int arr[] = new int[size];
					System.out.println("Enter an element to store an array.");
					int ele = scan.nextInt();
					System.out.println("Enter an index to store the element");
					int i = scan.nextInt();
					arr[i] = ele;
					System.out.println("Element Insertion Successfully.");
		}
		catch(ArithmeticException ae)
		{
				System.out.println("plz,give denominator value is greter than 0");			
		}
		catch(NegativeArraySizeException nas)
		{
			System.out.println("Give The Value Of Array Index is positive");
		}
		catch(InputMismatchException ime)
		{
				System.out.println("Give The Value Of insert element as a Integer");
		}
		catch(ArrayIndexOutOfBoundsException aiobe)
		{
				System.out.println("plz,Proivide Array index in between array size");
		}
		catch(Exception e)
		{
				System.out.println("Some Problem occured.");
		}
		System.out.println("Connection is termination");
	}
}
