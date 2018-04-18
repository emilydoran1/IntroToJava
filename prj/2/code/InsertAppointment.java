import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class InsertAppointment {
	public void insertAppointment(String email, Date date, String extraInfo) {
			try (
				// Step 1: Allocate a database 'Connection' object
				Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/salondb?useSSL=false", "myuser", "password");
				 
				// Step 2: Allocate a 'Statement' object in the Connection
				Statement stmt = conn.createStatement();
			) {
				 // INSERT a record
				String sqlInsert = "insert into appointment (email, date, extraInfo) values (?, ?, ?)";
			         //+ "('emily.doran1@marist.edu', '2012-01-01', 'Hair cut and color'),"
			         //+ "('jimdoran64@gmail.com', '2014-05-09', 'Hair trim')";
		         //System.out.println("The SQL query is: " + sqlInsert);  // Echo for debugging
				
				java.sql.Date sDate = new java.sql.Date(date.getTime());
				
				PreparedStatement ps = conn.prepareStatement(sqlInsert);
				ps.setString(1, email);
				//ps.setDate(2, date);
				ps.setTimestamp(2, new java.sql.Timestamp(date.getTime()));
				ps.setString(3, extraInfo);
				ps.executeUpdate();
				
				//int countInserted = stmt.executeUpdate(sqlInsert);
				//System.out.println(countInserted + " records inserted.\n");
			}
				
			catch(SQLException ex) {
		         ex.printStackTrace();
		    }
			// Step 5: Close the resources - Done automatically by try-with-resources
		}
}
