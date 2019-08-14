/*
Handling Exception with User Define Exception Handler. 

		Case:1
				Connection is Estlibished.
				Enter a numerator
				100
				Enter a denominator
				10
				10
				Enter the size of an array
				5
				Enter an element to store an array.
				99
				Enter an index to store the element
				2
				Element Insertion Successfully.
				Connection is termination

		Case 2:

						Connection is Estlibished.
						Enter a numerator
						100
						Enter a denominator
						0
						Some Problem occured.
						Connection is termination
			
		Case:3
				Connection is Estlibished.
				Enter a numerator
				100
				Enter a denominator
				10
				10
				Enter the size of an array
				-5
				Some Problem occured.
				Connection is termination

		Case 4:
				Connection is Estlibished.
				Enter a numerator
				100
				Enter a denominator
				10
				10
				Enter the size of an array
				5
				Enter an element to store an array.
				99.30
				Some Problem occured.
				Connection is termination

	Case 5:
				Connection is Estlibished.
					Enter a numerator
					100
					Enter a denominator
					10
					10
					Enter the size of an array
					5
					Enter an element to store an array.
					10
					Enter an index to store the element
					6
					Some Problem occured.
					Connection is termination
			
*/
import java.util.*;

class Program4_HandlingExceptionWithUDEH
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
		catch(Exception e)
		{
				System.out.println("Some Problem occured.");
		}
		System.out.println("Connection is termination");
	}
}
