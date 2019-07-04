/*
 * The java.lang.Integer.toBinaryString() method returns a string representation of 
 * the integer argument as an unsigned integer in base 2. 
 * It accepts an argument in Int data-type and returns the corresponding binary string.
 * 
 * Syntax:

		public static String toBinaryString(int num)

		Parameter : The function accepts a single mandatory parameter num 
		num - This parameter specifies the number to be converted to binary string. 
		It is of int data-type
		
		Return Value: 
		This function returns the string representation of the unsigned Integer value represented by the argument in binary (base 2).
		
		Examples:
		
		Input : 10 
		Output : 1010 
		
		Input : 9
		Output : 1001 
 * */
package toBinaryString_Method;

public class Problem1 {

	public static void main(String[] args) {
		
		int i = 10;
		
		System.out.println("Binary String is i = "+ i +" ::: "+ Integer.toBinaryString(i)); //1010
		
		i = 50;
		System.out.println("Binary String is i= "+ i + " ::: "+ Integer.toBinaryString(i)); //110010

	}

}
