import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

public class ListAll {
	public void listAll() {
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
			//sorts by date in ascending order
			String strSelect = "select * from appointment ORDER BY date ASC";
	
			//System.out.println("The SQL query is: " + strSelect); // Echo For debugging
			//System.out.println();
			 
			ResultSet rset = stmt.executeQuery(strSelect);
				 
			// Step 4: Process the ResultSet by scrolling the cursor forward via next().
			//  For each row, retrieve the contents of the cells with getXxx(columnName).
			//System.out.println("The records selected are:");
			int rowCount = 0;
			while(rset.next()) {   // Move the cursor to the next row, return false if no more row
				String email = rset.getString("email");
					
				Timestamp date;
				date=rset.getTimestamp(2);
					
				String extraInfo = rset.getString("extraInfo");
			    System.out.println("Date: " + date + "\nEmail: " + email + "\nExtra Info: " + extraInfo);
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
