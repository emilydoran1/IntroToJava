import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertPerson {
	private Connection myConn;

	public void insertIntoPerson(String name, String email) {
		try (
			// Step 1: Allocate a database 'Connection' object
			Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/salondb?useSSL=false", "myuser", "password");
			 
			// Step 2: Allocate a 'Statement' object in the Connection
			Statement stmt = conn.createStatement();
		) {
			 // INSERT a record
			String sqlInsert = "insert into person (name, email) values (?, ?)";
		         //+ "('Emily Doran', 'emily.doran1@marist.edu'),"
		        // + "('Jim Doran', 'jimdoran64@gmail.com')";
			
			PreparedStatement ps = conn.prepareStatement(sqlInsert);
			ps.setString(1, name);
			ps.setString(2, email);
			ps.executeUpdate();
		        
	         //System.out.println("The SQL query is: " + sqlInsert); 

			//int countInserted = stmt.executeUpdate();
			//System.out.println(countInserted + " records inserted.\n");
		}
			
		catch(SQLException ex) {
	         ex.printStackTrace();
	    }
		// Step 5: Close the resources - Done automatically by try-with-resources
	}

}
