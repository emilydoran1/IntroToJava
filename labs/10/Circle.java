
public class Circle extends GeometricObject implements Comparable<Circle>{
	private double radius;
	
	public Circle() {
		
	}

	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	/**return radius */
	public double getRadius() {
		return radius;
	}
	
	/**set a new radius*/
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**return area*/
	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	/**return diameter*/
	public double getDiameter() {
		return 2 * radius;
	}
	
	/**return perimeter*/
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	/**print the circle info*/
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() +
				" and the radius is " + radius);
	}
	
	@Override
	public boolean equals(Object object) {
		boolean isEqual = false;
		if(this.compareTo((Circle)object) == 0)
			isEqual = true;
		return isEqual;
	}

	@Override
	public int compareTo(Circle circle) {
		if(this.radius > circle.radius)
			return 1;
		else if(this.radius < circle.radius)
			return -1;
		else
			return 0;
	}
	
}
