import java.util.Scanner;
public class NumberOfYears
{
    public static void main(String[] args)
    {
        //Problem 2.7 from the book
        //This class takes in the number of minutes from the user. It then calculates the years and remaining days
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        
        final int MIN_IN_YEAR = 525600;
        final int MIN_IN_DAY = 1440;
        
        int years = minutes / MIN_IN_YEAR;
        int remainingMin = minutes % MIN_IN_YEAR;
        int days = remainingMin / MIN_IN_DAY;
         
        
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }
}
