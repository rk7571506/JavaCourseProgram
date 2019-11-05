import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchingTheEntireTableUsing_ColoumnNames {

	public static void main(String[] args) {
		
		String url ="jdbc:oracle:thin:@//localhost:1521/XE";
		String un = "SYSTEM";
		String pw = "SYSTEM";
		Connection con = null;
		Statement stmt = null;
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
    		String s = "SELECT * FROM STUDENT";
			stmt = con.createStatement();
			res = stmt.executeQuery(s);
			System.out.println("Query execute Successfully.");
		 } 
    	 catch(SQLException e) 
    	 {
			e.printStackTrace();
    	 }
    	 
    	 try 
    	 {
			while(res.next()==true)
			 {
				String a = res.getString("name");
				String b = res.getString("usn");
				int c 	 = res.getInt("mark1");
				int d 	 = res.getInt("mark2");
				int e 	 = res.getInt("mark3");
				
				System.out.println(a+" "+b+" "+c+" "+d+" "+e);
			 }
    	 } 
    	 catch (SQLException e) 
    	 {
    		 e.printStackTrace();
    	 }
	}
}
