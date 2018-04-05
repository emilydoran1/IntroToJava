public class Triangle extends GeometricObject {
	//create 3 double data fields
	private double side1;
	private double side2;
	private double side3;
	
	/**default constructor*/
	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	/**create constructor with specified values*/
	public Triangle(double side1, double side2, double side3)
		throws IllegalTriangleException {
		if((side1 + side2 <=side3) || (side1 + side3 <= side2) || (side2 + side3 <= side1)) {
			throw new IllegalTriangleException(side1, side2, side3);
		}
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	/**accessor method for side1*/
	public double getSide1() {
		return side1;
	}

	/**accessor method for side2*/
	public double getSide2() {
		return side2;
	}

	/**accessor method for side3*/
	public double getSide3() {
		return side3;
	}
	
	/**method returns area of triangle*/
	public double getArea() {
		double x = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(x * (x - side1) * (x - side2) * (x - side3));
		return area;
	}
	
	/**method returns perimeter of the triangle*/
	public double getPerimeter() {
		double perimeter = side1 + side2 + side3;
		return perimeter;
	}
	
	/**method returns a String description for the triangle*/
	@Override
	public String toString() {
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + 
				" side3 = " + side3;
	}
}
