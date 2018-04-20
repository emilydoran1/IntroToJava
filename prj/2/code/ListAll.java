import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

public class ListAll {
	public void listAll() throws IOException {
		//define a HTML String Builder
		StringBuilder htmlStringBuilder=new StringBuilder();
        //append html header and title
		htmlStringBuilder.append("<html><head><title>Emily's Salon</title><style>\n" + 
            "            body{\n" + 
       		"                background-color: lightpink;\n" + 
       		"            }\n" + 
            "            \n" + 
           	"            #h1{\n" +  
          	"                font-family: fantasy;\n" + 
            "                color: deeppink;\n" + 
            "                font-size: 100px;\n" + 
            "            }\n" + 
            "            \n" + 
            "            #h2{\n" + 
            "                font-family: fantasy;\n" + 
            "                color: deeppink;\n" + 
            "                font-size: 50px;\n" + 
            "                \n" + 
            "            }\n" + 
            "            \n" + 
            "			 .h3{\n" +
            "			 	text-align: center;\n" +
            "				font-family: fantasy;\n" +
           	"				\n" +
            "			}\n" +
            "        </style></head>");
       //append body
       htmlStringBuilder.append("<body>");
          
       htmlStringBuilder.append("<h1 id = \"h1\">Emily's Salon</h1>");
       htmlStringBuilder.append("<break/>");
       htmlStringBuilder.append("<h2 id = \"h2\"> <u>Upcoming Appointments: </u></h2>");
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
					
					htmlStringBuilder.append("<h4 style=\"display: inline;\"> Date: </h4>" + date);
					htmlStringBuilder.append("<br />");
					htmlStringBuilder.append("<h4 style=\"display: inline;\"> Email: </h4>" + email);
					htmlStringBuilder.append("<br />");
					htmlStringBuilder.append("<h4 style=\"display: inline;\"> Extra Info: </h4>" + extraInfo);
					
					htmlStringBuilder.append("<br />");
					htmlStringBuilder.append("<br />");
					//System.out.println("Date: " + date + "\nEmail: " + email + "\nExtra Info: " + extraInfo);
			        ++rowCount;
			        //System.out.println();
        		}
         }
         catch(SQLException ex) {	
        	  ex.printStackTrace();
		 }
        //close html file
        htmlStringBuilder.append("</body></html>");
        //write html string content to a file
        WriteToFile(htmlStringBuilder.toString(),"salon.html");
            
        
	}
		
	public static void WriteToFile(String fileContent, String fileName) throws IOException {
		String projectPath = System.getProperty("user.dir");
	    String tempFile = projectPath + File.separator+fileName;
	    File file = new File(tempFile);
	    // if file does exist, then delete and create a new file
	    if (file.exists()) {
	    	try {
	    		File newFileName = new File(projectPath + File.separator+ "backup_"+fileName);
	            file.renameTo(newFileName);
	            file.createNewFile();
	    	} catch (IOException e) {
	              e.printStackTrace();
	         	}
	    }
	    //write to file with OutputStreamWriter
	    OutputStream outputStream = new FileOutputStream(file.getAbsoluteFile());
	    Writer writer=new OutputStreamWriter(outputStream);
	    writer.write(fileContent);
	    writer.close();
	    System.out.println("Manager: Please open file salon.html");

	}

}
