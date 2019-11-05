import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BatchFile {

	public static void main(String[] args) {
		String url ="jdbc:oracle:thin:@//localhost:1521/XE";
		String un = "SYSTEM";
		String pw = "SYSTEM";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
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
    			for(int i=1;i<=5;i++)
    	    	{
    	    		String s = "UPDATE STUDENT1 SET SEM=8 WHERE SEM = 7";
    	    		pstmt = con.prepareStatement(s);
    	    		pstmt.addBatch();
    	    	}
    			pstmt.executeBatch();
    			System.out.println("Query Execute Successfully.");
			} 
    		catch (SQLException e) 
    		{
				e.printStackTrace();
			}
	}
}
