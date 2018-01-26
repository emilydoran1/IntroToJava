import java.util.Scanner;
public class CelsiusToFahrenheit
{
   public static void main(String[] args)
   {
       //this is problem 2.1 from the book
       //this class takes in a temp in celsius from the user and converts it to Fahrenheit
       Scanner input = new Scanner(System.in);
       
       System.out.print("Enter a degree in Celsius: ");
       double celsius = input.nextDouble();
       
       double fahrenheit = (celsius * (9.0/5)) + 32;
       
       System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
   }
}
