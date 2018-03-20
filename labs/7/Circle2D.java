
public class Circle2D {
	//create two double data fields named x and y
	private double x;
	private double y;
	
	//create a data field radius
	private double radius;
	
	//create a no argument constructor that creates a default circle
	public Circle2D() {
		x = 0;
		y = 0;
		radius = 0;
	}
	
	//create a constructor that creates a circle with specified x, y, and radius
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	//create a getter for x
	public double getX() {
		return x;
	}
	
	//create a getter for y
	public double getY() {
		return y;
	}
	
	//create a getter for radius
	public double getRadius() {
		return radius;
	}
	
	//create a method getArea() that returns the area of the circle
	public double getArea() {
		double area = Math.PI * radius * radius;
		return area;
	}
	
	//create a method getPerimeter() that returns the perimeter of the circle
	public double getPerimeter() {
		double perimeter = Math.PI * (2 * radius);
		return perimeter;
	}
	
	//create a method contains(double x, double y) that returns true if the point is inside the circle
	public boolean contains(double x, double y) {
		boolean contains = false;
		if(Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2)) < radius)
			contains = true;
		return contains;
	}
	
	//create a method contains(Circle2D circle) that returns true if the circle is inside this circle
	public boolean contains(Circle2D circle) {
		boolean contains = false;
		if(Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) 
				 <= Math.abs(radius - circle.getRadius()))
			contains = true;
		return contains;
	}
	
	//create a method overlaps(Circle2D circle) that returns true if the circle overlaps this circle
	public boolean overlaps(Circle2D circle) {
		boolean overlaps = false;
		if(Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2)) 
				 <= radius + circle.getRadius())
			overlaps = true;
		return overlaps;
	}

}
