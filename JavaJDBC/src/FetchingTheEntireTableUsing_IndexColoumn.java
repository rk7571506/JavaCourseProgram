import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchingTheEntireTableUsing_IndexColoumn {

	public static void main(String[] args) {
		
		
		String url = "jdbc:oracle:thin:@//localhost:1521/XE";
		String un = "SYSTEM";
		String pw = "SYSTEM";
		Connection con = null;
		Statement stmt = null;
		ResultSet res = null;
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
		
		String s = "SELECT * FROM STUDENT";
		
		try 
		{
			 stmt = con.createStatement();
		     res    =  stmt.executeQuery(s);
		     System.out.println("Query Execution Successfully.");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		try 
		{
			while(res.next()==true)
			{
				String a = res.getString(1);
				String b = res.getString(2);
				int c = res.getInt(3);
				int d = res.getInt(4);
				int e = res.getInt(5);
				
				System.out.println(a+" "+b+" "+c+" "+d+" "+e);
			}
		} 
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}

	}

}
