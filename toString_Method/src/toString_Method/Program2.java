package toString_Method;
import java.lang.*;
class Best_Friend1{
	String name;
	int age;
	String college;
	String course;
	String address;
	
	Best_Friend1(String name,int age , String college, String course , String address)
	{
		this.name = name;
		this.age = age;
		this.college = college;
		this.course = course;
		this.address = address;
	}
	
	//override the method toString();
	
	public String toString()
	{
		return (name+" "+age+" "+college+" "+course+" "+address+" ");
	}
}


public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Best_Friend1 bff = new Best_Friend1("Ravi Ranjan",20,"ECB","B.Tech","Hanumangarh Junction");
		
		System.out.println(bff); //Ravi Ranjan 20 ECB B.Tech Hanumangarh Junction 
		
		Best_Friend1 bff1 = new Best_Friend1("Pooja Kumari", 18, "SKS", "B.sc", "HMH");
		
		System.out.println(bff1.toString()); //Pooja Kumari 18 SKS B.sc HMH 
	}

}
