/*
 * Sometimes, we have to check if the next value we read is of a certain type or if the input has ended (EOF marker encountered).

Then, we check if the scanner’s input is of the type we want with the help of hasNextXYZ() 
functions where XYZ is the type we are interested in. The function returns true if the scanner 
has a token of that type, otherwise false. For example, in the below code, we have used hasNextInt(). 
To check for a string, we use hasNextLine(). Similarly, to check for a single character, we use hasNext().charAt(0).

Let us look at the code snippet to read some numbers from console and print their mean.
 * */

import java.util.*;
public class TakingInputEndOfFile_EOF_In_Java {
		public static void main(String []args)
		{
			Scanner scan = new Scanner(System.in);
			//scan.hasNextXYZ()
			int sum = 0,count=0;
			while(scan.hasNextInt()) //if we read an integer data EOF.
			{
				int num  = scan.nextInt();
				sum+=num;
				count++;
			}
			System.out.println(sum/count);
		}
}
