import java.util.Scanner;

public class Problem3_5 
{

	public static void main(String[] args) 
	{
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter today's day: ");
		int today = input.nextInt();
		
		System.out.println("Enter the number of days elapsed since today: ");
		int daysElapsed = input.nextInt();
		int futureDay = (today + daysElapsed) % 7;

		//find out what day of week today is
		String dayOfWeek = "";
		switch(today) 
		{
			case 0: dayOfWeek = "Sunday"; break;
			case 1: dayOfWeek = "Monday"; break;
			case 2: dayOfWeek = "Tuesday"; break;
			case 3: dayOfWeek = "Wednesday"; break;
			case 4: dayOfWeek = "Thursday"; break;
			case 5: dayOfWeek = "Friday"; break;
			case 6: dayOfWeek = "Saturday"; break;
		}

		switch(futureDay)
		{
			case 0: System.out.println("Today is " + dayOfWeek + " and the future day is Sunday"); break;
			case 1: System.out.println("Today is " + dayOfWeek + " and the future day is Monday"); break;
			case 2: System.out.println("Today is " + dayOfWeek + " and the future day is Tuesday"); break;
			case 3: System.out.println("Today is " + dayOfWeek + " and the future day is Wednesday"); break;
			case 4: System.out.println("Today is " + dayOfWeek + " and the future day is Thursday"); break;
			case 5: System.out.println("Today is " + dayOfWeek + " and the future day is Friday"); break;
			case 6: System.out.println("Today is " + dayOfWeek + " and the future day is Saturday"); break;
				
		}
		
	}

}
