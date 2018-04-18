import java.sql.*;

public class UpdatePerson {
	public void updatePersonInfo(String name, String email) {
		try (
				// Step 1: Allocate a database 'Connection' object
				Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/salondb?useSSL=false", "myuser", "password");
				 
				// Step 2: Allocate a 'Statement' object in the Connection
				Statement stmt = conn.createStatement();
			) {
				// Step 3 & 4: Execute a SQL UPDATE via executeUpdate()
				//change name
		         String strUpdate = "update person set name = ? where email = ? ";
		         //System.out.println("The SQL query is: " + strUpdate);  // Echo for debugging
		         //System.out.println(countUpdated + " records affected.");
		         PreparedStatement ps = conn.prepareStatement(strUpdate);
				 ps.setString(1, name);
				 ps.setString(2, email);
				 ps.executeUpdate();
		         //int countUpdated = stmt.executeUpdate(strUpdate);
		 
		         //Issue a SELECT to check the UPDATE.
		         String strSelect = "select * from person where email = ? ";
		         PreparedStatement ps2 = conn.prepareStatement(strSelect);
					ps2.setString(1, email);
		         ps2.setString(1, email);
		         ResultSet rset = ps2.executeQuery();
		         //System.out.println("The SQL query is: " + strSelect);  // Echo for debugging
		         
		         while(rset.next()) {   // Move the cursor to the next row
		            System.out.println(rset.getString("name") + ", "
		                    + rset.getString("email"));
		         }
		      } catch(SQLException ex) {
		         ex.printStackTrace();
		      }
		      // Step 5: Close the resources - Done automatically by try-with-resources
	}
}
