import java.util.Scanner;

public class Problem6_19 {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 3 sides for a triangle: ");
		double s1 = input.nextDouble();
		double s2 = input.nextDouble();
		double s3 = input.nextDouble();
		
		if(isValid(s1, s2, s3)) {
			System.out.println("The area is " + area(s1, s2, s3));
		}
		else
			System.out.println("The input is invalid.");
	}
	
	/** Return true if the sum of every two sides is greater than the third side*/
	public static boolean isValid(double side1, double side2, double side3) {
		boolean isTrue = false;
		if(((side1 + side2) > side3) && ((side1 + side3) > side2) && ((side2 + side3) > side1))
			isTrue = true;
		
		return isTrue;
	}
	
	/** Return the area of the triangle */
	public static double area(double side1, double side2, double side3) {
		//compute the area
		double s = side1 + side2 + side3;
		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
		
		return area;
	}
}
