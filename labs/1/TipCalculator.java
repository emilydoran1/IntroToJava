import java.util.Scanner;
public class TipCalculator
{
    public static void main(String[] args)
    {
        //problem 2.5 from the book
        //this class takes in the subtotal and gratuity amount from the user and calculates the tip and total
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();
        
        double gratuity = subtotal * (gratuityRate/100);
        double total = subtotal + gratuity;
        
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
