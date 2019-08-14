/*
 * Scanner is a class in java.util package used for obtaining the input of 
 * the primitive types like int, double, etc. and strings.
 *  It is the easiest way to read input in a Java program, 
 *  though not very efficient if you want an input method for scenarios where 
 * time is a constraint like in competitive programming.
 * 
 *   -> To create an object of Scanner class, we usually pass the predefined 
 *      object System.in, which represents the standard input stream. 
 *       We may pass an object of class File if we want to read input 
 *       from a file.
 *       
 *  ->  To read numerical values of a certain data type XYZ,
 *  	 the function to use is nextXYZ(). For example, 
 *  		to read a value of type short, we can use nextShort()
			To read strings, we use nextLine().
	-> To read a single character, we use next().charAt(0). next() function returns the next token/word in the input as a string and charAt(0) 
		function returns the first character in that string.
 * */

import java.util.*;
public class TakingInputInJavaDataType {

	public static void main(String[] args) {
	
			Scanner scan = new Scanner(System.in);
			
			//String Input:
			System.out.println("Enter String Input:");
			String s1 = scan.nextLine();
			System.out.println(s1);
			
			//character input.
			System.out.println("Enter Character Input:");
			char s2 = scan.next().charAt(0);
			System.out.println(s2);
			
			//taking input a word.
			System.out.println("Word Input:");
			String s3 = scan.next();
			System.out.println(s3);
			
			//Numerical Data Input:
			System.out.println("Enter Integer int value:");
			int i = scan.nextInt();
			System.out.println(i);
			
			System.out.println("Enter Long value:");
			long l = scan.nextLong();
			System.out.println(l);
			
			System.out.println("Enter Short Value");
			short s = scan.nextShort();
			System.out.println(s);
			
			System.out.println("Enter Byte value:");
			byte b = scan.nextByte();
			System.out.println(b);
			
			System.out.println("Enter Float Value");
			float f = scan.nextFloat();
			System.out.println(f);
			
			System.out.println("Enter  Double Value");
			double d = scan.nextDouble();
			System.out.println(d);
			
			//Boolean Value:
			System.out.println("Enter Boolean Value");
			boolean be = scan.nextBoolean();
			System.out.println(be);
	}

}
