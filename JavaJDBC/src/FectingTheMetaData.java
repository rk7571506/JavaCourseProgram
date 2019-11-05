import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class FectingTheMetaData {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@//localhost:1521/XE";
		String un  = "SYSTEM";
		String pw  = "SYSTEM";
		Connection con = null;
		Statement stmt = null;
		ResultSet res = null;
		ResultSetMetaData rsmd = null;
		
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
			System.out.println("Connection is estd.");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		String s = "SELECT * FROM STUDENT";
		
		 try 
		 {
			stmt = con.createStatement();
			res  = stmt.executeQuery(s);
			System.out.println("Queary Executed Successfully.");
		 } 
		 catch (SQLException e) 
		 {
			e.printStackTrace();
		 }
		
		 
		 try 
		 {
			rsmd = res.getMetaData();
			for(int i=1;i<=rsmd.getColumnCount();i++)
			{
				System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));
			}
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
