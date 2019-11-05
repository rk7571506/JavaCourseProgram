import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchingASpecificRow {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@//localhost:1521/XE";
		String user = "SYSTEM";
		String password = "SYSTEM";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
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
			System.out.println("Connection Estd. Successfully.");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		try
		{
			String s = "SELECT * FROM STUDENT WHERE USN = ?";
			pstmt = con.prepareStatement(s);
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter The USN:");
			String usn  = scan.next();
			pstmt.setString(1, usn);
			
		    rset = pstmt.executeQuery();
		    System.out.println("Query Execute Successfully.");
			
		} 
		catch (SQLException e)
		{

			e.printStackTrace();
		}
		
		
		try
		{
			while(rset.next()==true)
			{
				String name = rset.getString(1);
				String usn  = rset.getString(2);
				int mark1   = rset.getInt(3);
				int mark2   = rset.getInt(4);
				int mark3   = rset.getInt(5);
				System.out.println(name+" "+usn+" "+mark1+" "+mark2+" "+mark3);
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

	}

}
