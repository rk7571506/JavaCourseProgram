import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEstablishingClientAndServer {

	public static void main(String[] args) {
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loaded Successfully.");
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String url = "jdbc:oracle:thin:@//localhost:1521/XE";
		String un  = "SYSTEM";
		String pw = "SYSTEM";
		
		try 
		{
			DriverManager.getConnection(url, un, pw);
			System.out.println("Connection Estlibished.");
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
