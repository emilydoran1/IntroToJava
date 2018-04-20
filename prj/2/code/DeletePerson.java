import java.sql.*;

public class DeletePerson {

	public void deletePersonInfo(String email) {
		try (
		    // Step 1: Allocate a database 'Connection' object
			Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/salondb?useSSL=false", "myuser", "password"); // MySQL
		 
		    // Step 2: Allocate a 'Statement' object in the Connection
			Statement stmt = conn.createStatement();
		) {
			// DELETE records with email = ?
	         String sqlDelete = "delete from person where email = ?";
	         PreparedStatement ps = conn.prepareStatement(sqlDelete);
			 ps.setString(1, email);
			 ps.executeUpdate();
	         //System.out.println("The SQL query is: " + sqlDelete);  // Echo for debugging
	         //int countDeleted = stmt.executeUpdate(sqlDelete);
	         //System.out.println(countDeleted + " records deleted.\n");
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
		// Step 5: Close the resources - Done automatically by try-with-resources
	}

}
