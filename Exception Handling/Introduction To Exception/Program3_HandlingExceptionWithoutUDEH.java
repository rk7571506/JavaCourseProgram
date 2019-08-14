/*
	Handling Exception wthout User Define Exception Handler.
		
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

		Case:2

				Connection is Estlibished.
					Enter a numerator
					100
					Enter a denominator
					0
					Exception in thread "main" java.lang.ArithmeticException: / by zero
							at Program3_HandlingExceptionWithoutUDEH.main(Program3_HandlingExceptionWithoutUDEH.java:38)
		
		Case:3
				Connection is Estlibished.
				Enter a numerator
				100
				Enter a denominator
				10
				10
				Enter the size of an array
				-5
				Exception in thread "main" java.lang.NegativeArraySizeException
						at Program3_HandlingExceptionWithoutUDEH.main(Program3_HandlingExceptionWithoutUDEH.java:43)
			
		Case : 4
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
					6
					Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6
							at Program3_HandlingExceptionWithoutUDEH.main(Program3_HandlingExceptionWithoutUDEH.java:72)

		Case : 5
						Connection is Estlibished.
						Enter a numerator
						1
						Enter a denominator
						2
						0
						Enter the size of an array
						5
						Enter an element to store an array.
						66.30
						Exception in thread "main" java.util.InputMismatchException
								at java.util.Scanner.throwFor(Scanner.java:864)
								at java.util.Scanner.next(Scanner.java:1485)
								at java.util.Scanner.nextInt(Scanner.java:2117)
								at java.util.Scanner.nextInt(Scanner.java:2076)
								at Program3_HandlingExceptionWithoutUDEH.main(Program3_HandlingExceptionWithoutUDEH.java:81)

*/

import java.util.*;

class Program3_HandlingExceptionWithoutUDEH
{
	public static void main(String[] args) 
	{
		System.out.println("Connection is Estlibished.");
		Scanner scan = new Scanner(System.in);
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
		System.out.println("Connection is termination");
	}
}
