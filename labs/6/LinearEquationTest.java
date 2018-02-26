import java.util.Scanner;

public class LinearEquationTest {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter a, b, c, d, e, and f
		System.out.print("Enter a, b, c, d, e, f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		//create an object using values inputted by user
		LinearEquation myLinearEquation = new LinearEquation(a, b, c, d, e, f);
		
		if(myLinearEquation.isSolvable()) {
			System.out.println("x is " + myLinearEquation.getX() + " and y is " + myLinearEquation.getY());
		}
		else
			System.out.println("The equation has no solution.");
	}

}
