import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

public class SelectAppointment {
	public void selectAppointment(String email) {
		try (
			// Step 1: Allocate a database 'Connection' object
			Connection conn = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/salondb?useSSL=false", "myuser", "password");
				// MySQL: "jdbc:mysql://hostname:port/databaseName", "username", "password"
			 
			// Step 2: Allocate a 'Statement' object in the Connection
			Statement stmt = conn.createStatement();
	  ) {
			// Step 3: Execute a SQL SELECT query, the query result
			//  is returned in a 'ResultSet' object.
			String strSelect = "select * from appointment where email = ?";
			//System.out.println("The SQL query is: " + strSelect); // Echo For debugging
			//System.out.println();
			 
			PreparedStatement ps = conn.prepareStatement(strSelect);
			ps.setString(1, email);
		 
			ResultSet rset = ps.executeQuery();
			 
			// Step 4: Process the ResultSet by scrolling the cursor forward via next().
			//  For each row, retrieve the contents of the cells with getXxx(columnName).
			//System.out.println("The records selected are:");
			int rowCount = 0;
			while(rset.next()) {   // Move the cursor to the next row, return false if no more row
				email = rset.getString("email");
				
				//Date date = rset.getDate("date");
				//date = new java.sql.Timestamp(date.getTime());
				
				Timestamp date;
				date=rset.getTimestamp(2);
				
			    String extraInfo = rset.getString("extraInfo");
		        System.out.println("Date: " + date + "\nExtra Info: " + extraInfo);
		        ++rowCount;
		        System.out.println();
			}
			//System.out.println("Total number of records = " + rowCount);
			 
	    } 
		catch(SQLException ex) {	
	    	ex.printStackTrace();
		}
		// Step 5: Close the resources - Done automatically by try-with-resources
	}

}

