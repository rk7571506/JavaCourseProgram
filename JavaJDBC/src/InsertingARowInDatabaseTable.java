import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertingARowInDatabaseTable {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@//localhost:1521/XE";
		String user = "SYSTEM";
		String password = "SYSTEM";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Successfully.");
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		 try
		 {
			con = DriverManager.getConnection(url, user, password);
			System.out.println("connection estd. successfully.");
		 } 
		 catch (SQLException e) 
		 {
			e.printStackTrace();
		 }
		 
		  try 
		  {
			  String s = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";
			  pstmt = con.prepareStatement(s);
			  Scanner sc = new Scanner(System.in);
			  System.out.println("Enter The Name:");
			  String name = sc.next();
			  System.out.println("Enter The USN:");
			  String usn = sc.next();
			  System.out.println("Enter The Mark1");
			  int mark1 = sc.nextInt();
			  System.out.println("Enter The Mark2");
			  int mark2 = sc.nextInt();
			  System.out.println("Enter the Mark3");
			  int mark3 = sc.nextInt();
			  pstmt.setString(1, name);
			  pstmt.setString(2, usn);
			  pstmt.setInt(3,mark1);
			  pstmt.setInt(4, mark2);
			  pstmt.setInt(5, mark3);
			  
			  pstmt.executeUpdate();
			  System.out.println("Query Executed Successfully.");
		  } 
		  catch (SQLException e) 
		  {
			e.printStackTrace();
		  }
		  
		 
	}

}
