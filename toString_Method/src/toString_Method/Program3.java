/*
 * NOTE:In all wrapper classes, all collection classes, String class, 
 * StringBuffer, StringBuilder classes toString() method is overriden 
 * for meaningful String representation. Hence, it is highly recommended to override toString() method in our class also.
 * */
package toString_Method;

import java.util.ArrayList;

class Best_Friend3{
	 String name; 
	    int age; 
	    String college; 
	    String course; 
	    String address; 
	    Best_Friend3 (String name, int age, String college, String course, String address) 
	    { 
	        this.name = name; 
	        this.age = age; 
	        this.college = college; 
	        this.course = course; 
	        this.address = address; 
	    } 
}

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Best_Friend3 bff = new Best_Friend3("Ravi", 20,"ECB", "B.Tech", "HMH");
		System.out.println(bff);
		//String Class 
		String s = new String("Gulpreet Kaur"); 
	     System.out.println(s); 
	     System.out.println(s.toString());
	      
	     //Wrapper Class
	     Integer i = new Integer(21); 
	        System.out.println(i); 
	        System.out.println(i.toString());
	       //Collection
	        ArrayList l = new ArrayList(); 
	        l.add("BIT"); 
	        l.add("M.TECH"); 
	        System.out.println(l); 
	        System.out.println(l.toString());
	        
	        /*Output:-
	         * 
	         * toString_Method.Best_Friend3@15db9742
				Gulpreet Kaur
				Gulpreet Kaur
				21
				21
				[BIT, M.TECH]
				[BIT, M.TECH]
	         * */

	}

}
