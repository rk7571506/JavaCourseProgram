/*
 * Object toString() Method in Java
Every class in java is child of Object class either directly or indirectly. 
Object class contains toString() method. We can use toString() method to get string representation of an object.
 Whenever we try to print the Object reference then internally toString() method is invoked. 
 If we did not define toString() method in your class then Object class toString() method is invoked otherwise our 
 implemented/Overridden toString() method will be called.
 *
 * Syntax of Object class toString() method:

		public String toString()
		{
		      return getClass().getName()+"@"+Integer.toHexString(hashCode());
		}
 * 
 * */

package toString_Method;

class Best_Friend{
	String name;
	int age;
	String college;
	String course;
	String address;
	
	Best_Friend(String name,int age , String college, String course , String address)
	{
		this.name = name;
		this.age = age;
		this.college = college;
		this.course = course;
		this.address = address;
	}
}

public class Program1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Best_Friend bff = new Best_Friend("Ravi Ranjan",20,"ECB","B.Tech","Hanumangarh Junction");
		
		System.out.println(bff); //Best_Friend@15db9742

	}

}
