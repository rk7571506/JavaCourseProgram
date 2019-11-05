import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class DriverLoadFromHDDTORAMProgram1 {

	public static void main(String[] args) {
		
		try 
		{
			DriverManager.registerDriver(new OracleDriver());
			System.out.println("Driver loaded Successfully.");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		

	}

}
