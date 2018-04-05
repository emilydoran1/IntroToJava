import java.util.Scanner;

public class TriangleTest {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter a color for triangle
		System.out.println("Enter a color: ");
		String color = input.next();
		
		//prompt user to enter if the triangle is filled
		System.out.println("Is the triangle filled (true/false): ");
		boolean filled = input.nextBoolean();
				
		//prompt user to enter 3 sides of the triangle
		System.out.print("Enter 3 double values for sides of a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
			
		try {
			//create a Triangle object with sides and set filled and color properties
			Triangle myTriangle = new Triangle(side1, side2, side3);
				
			myTriangle.setColor(color);
			myTriangle.setFilled(filled);
				
			//display the area, perimeter, color, and true or false if the triangle is filled or not
			System.out.println(myTriangle.toString());
			System.out.println("Area: " + myTriangle.getArea());
			System.out.println("Perimeter: " + myTriangle.getPerimeter());
			System.out.println("Color: " + myTriangle.getColor());
			if(filled)
				System.out.println("The triangle is filled");
			else
				System.out.println("The triangle is not filled.");
		}
		catch (IllegalTriangleException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

}

