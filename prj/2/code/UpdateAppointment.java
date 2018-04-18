import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class UpdateAppointment {
	public void updateAppointment(String email, Date date, String extraInfo) {
		try (
				// Step 1: Allocate a database 'Connection' object
				Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/salondb?useSSL=false", "myuser", "password");
				 
				// Step 2: Allocate a 'Statement' object in the Connection
				Statement stmt = conn.createStatement();
			) {
				// Step 3 & 4: Execute a SQL UPDATE via executeUpdate()
		         //   which returns an int indicating the number of rows affected.
				//change name
				 String strUpdate = "update appointment set date = ?, extraInfo = ? where email = ? ";
		         
		         //System.out.println("The SQL query is: " + strUpdate);  // Echo for debugging
		         //int countUpdated = stmt.executeUpdate(strUpdate);
		         //System.out.println(countUpdated + " records affected.");
				 PreparedStatement ps = conn.prepareStatement(strUpdate);
				 ps.setTimestamp(1, new java.sql.Timestamp(date.getTime()));
				 ps.setString(2, extraInfo);
				 ps.setString(3, email);
				 ps.executeUpdate();
		 
		         // Step 3 & 4: Issue a SELECT to check the UPDATE.
		         String strSelect = "select * from appointment where email = ?";
		         PreparedStatement ps2 = conn.prepareStatement(strSelect);
				 ps2.setString(1, email);
		         ps2.setString(1, email);
		         ResultSet rset = ps2.executeQuery();
		         
		         //System.out.println("The SQL query is: " + strSelect);  // Echo for debugging
		         
		         while(rset.next()) {   // Move the cursor to the next row
		            System.out.println(rset.getString("date") + ", "
		                    + rset.getString("email") + ", " + rset.getString("extraInfo"));
		         }
		      } catch(SQLException ex) {
		         ex.printStackTrace();
		      }
		      // Step 5: Close the resources - Done automatically by try-with-resources
	}
}
