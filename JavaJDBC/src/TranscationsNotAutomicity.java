import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TranscationsNotAutomicity {

	public static void main(String[] args) {
		
		String url ="jdbc:oracle:thin:@//localhost:1521/XE";
		String un = "SYSTEM";
		String pw = "SYSTEM";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet res = null;
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver is Loaded  Successfully.");
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
    	try 
    	{
			con	= DriverManager.getConnection(url, un, pw);
			System.out.println("Connection is Estd.");
		}
    	catch (SQLException e)
    	{
			e.printStackTrace();
		}
    	
    	
    	try 
    	{
    		String s = "INSERT INTO STUDENT VALUES(?,?,?,?,?)";
			pstmt = con.prepareStatement(s);
			Scanner scan = new Scanner(System.in);
			for(int i=1;i<=3;i++)
			{
				System.out.println("Enter Name:");
				String name = scan.next();
				System.out.println("Enter USN");
				String usn = scan.next();
				System.out.println("Enter Mark1");
				int mark1 = scan.nextInt();
				System.out.println("Enter Mark2");
				int mark2 = scan.nextInt();
				System.out.println("Enter Mark3");
				int mark3 = scan.nextInt();
				
				pstmt.setString(1, name);
				pstmt.setString(2, usn);
				pstmt.setInt(3, mark1);
				pstmt.setInt(4, mark2);
				pstmt.setInt(5, mark3);
				
				pstmt.executeUpdate();
			}
			System.out.println("Query Exceuted Successfully.");
		}
    	catch (SQLException e) 
    	{
			e.printStackTrace();
		}
	}
}
