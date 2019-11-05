
public class DriverLoadFromHDDTORAMProgram2 {

	public static void main(String[] args) {
		
	 try 
	 {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		 System.out.println("Driver Loaded Successfully.");
	}
	catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	
	}

}
