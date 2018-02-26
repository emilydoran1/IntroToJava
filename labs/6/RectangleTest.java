
public class RectangleTest {

	public static void main(String[] args) {
		//create 2 rectangle objects
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		//print out width, height, area, and perimeter of each rectangle
		System.out.println("Rectangle 1: width: " + r1.width + ", height: " + 
				r1.height + ", area: " + r1.getArea() + ", perimeter: " + r1.getPerimeter());
		System.out.println("Rectangle 2: width: " + r2.width + ", height: " + 
				r2.height + ", area: " + r2.getArea() + ", perimeter: " + r2.getPerimeter());
	}

}
