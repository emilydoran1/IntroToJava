import java.util.GregorianCalendar;

public class Problem9_5 {

	public static void main(String[] args) {
		GregorianCalendar myCal = new GregorianCalendar();
		
		//print out current date
		System.out.println("The current date in format of M/DD/YYYY is: " + myCal.get(GregorianCalendar.MONTH) + 
				"/" + myCal.get(GregorianCalendar.DAY_OF_MONTH) + "/" + myCal.get(GregorianCalendar.YEAR));
		
		//set elapsed time since Jan 1, 1970
		myCal.setTimeInMillis(1234567898765L);
		
		//display the month, year, and day
		System.out.println("The elapsed time since January 1, 1970 \nset to 1234567898765L in format of M/DD/YYYY is: " 
				+ myCal.get(GregorianCalendar.MONTH) + "/" + myCal.get(GregorianCalendar.DAY_OF_MONTH) + 
				"/" + myCal.get(GregorianCalendar.YEAR));
		
	}

}
