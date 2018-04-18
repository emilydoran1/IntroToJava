import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class DeleteAppointment {

	public void deleteAppointment(String email) {
		try (
		    // Step 1: Allocate a database 'Connection' object
			Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/salondb?useSSL=false", "myuser", "password"); // MySQL
		 
		    // Step 2: Allocate a 'Statement' object in the Connection
			Statement stmt = conn.createStatement();
		) {
			// DELETE records with email = 'jimdoran64@gmail.com'
	         String sqlDelete = "delete from appointment where email = ?";
	         PreparedStatement ps = conn.prepareStatement(sqlDelete);
			 ps.setString(1, email);
			 ps.executeUpdate();
	         //System.out.println("The SQL query is: " + sqlDelete);  // Echo for debugging
	         //int countDeleted = stmt.executeUpdate(sqlDelete);
	        // System.out.println(countDeleted + " records deleted.\n");
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		// Step 5: Close the resources - Done automatically by try-with-resources
	}

}
