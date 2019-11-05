import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateASepicificRowInADataBaseTable {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@//localhost:1521/XE";
		String un = "SYSTEM";
		String pw = "SYSTEM";
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
			con = DriverManager.getConnection(url,un,pw);
			System.out.println("Connection is established.");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
		try 
		{
			String s  = "UPDATE STUDENT SET NAME=? WHERE USN = ?";
			pstmt = con.prepareStatement(s);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Name:");
			String name = sc.next();
			System.out.println("Enter The USN:");
			String usn = sc.next();
			pstmt.setString(1, name);
			pstmt.setString(2, usn);
			pstmt.executeUpdate();
			System.out.println("Query Execute Succesfully.");
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		

	}

}
