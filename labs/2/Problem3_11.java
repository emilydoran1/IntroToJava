import java.util.Scanner;

public class Problem3_11 {

	public static void main(String[] args) {
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter month and year
		System.out.print("Enter the month and year: ");
		int month = input.nextInt();
		int year = input.nextInt();
		
		//calculate what month it is and how many days it has
		String currentMonth = "";
		int daysInMonth = 0;
		switch(month) {
			case 1:
				currentMonth = "January";
				daysInMonth = 31;
				break;
			case 2:
				currentMonth = "February";
				if(year % 4 == 0)
					daysInMonth = 29;
				else
					daysInMonth = 28;
				break;
			case 3:
				currentMonth = "March";
				daysInMonth = 31;
				break;
			case 4:
				currentMonth = "April";
				daysInMonth = 30;
				break;
			case 5: 
				currentMonth = "May";
				daysInMonth = 31;
				break;
			case 6:
				currentMonth = "June";
				daysInMonth = 30;
				break;
			case 7:
				currentMonth = "July";
				daysInMonth = 31;
				break;
			case 8:
				currentMonth = "August";
				daysInMonth = 31;
				break;
			case 9:
				currentMonth = "September";
				daysInMonth = 30;
				break;
			case 10:
				currentMonth = "October";
				daysInMonth = 31;
				break;
			case 11:
				currentMonth = "November";
				daysInMonth = 30;
				break;
			case 12:
				currentMonth = "December";
				daysInMonth = 31;
				break;
		}
		
		//display month and year and how many days are in that month
		System.out.println(currentMonth + " " + year + " has " + daysInMonth + " days.");
	}

}
