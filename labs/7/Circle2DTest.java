
public class Circle2DTest {

	public static void main(String[] args) {
		//create a Circle2D object c1
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		
		//display c1 area
		System.out.println("The area of circle c1 is: " + c1.getArea());
		
		//display c1 perimeter
		System.out.println("The perimeter of circle c1 is " + c1.getPerimeter());
		
		//display result of c1.contains(3, 3)
		System.out.println("C1 contains the point (3, 3): " + c1.contains(3, 3));
		
		//display result of c1.contains(new Circle2D(4, 5, 10.5))
		System.out.println("C1 contains the Circle2D (4, 5, 10.5): " + c1.contains(new Circle2D(4, 5, 10.5)));
		
		//display result of c1.overlaps(new Circle2D(3, 5, 2.3))
		System.out.println("C1 overlaps the Circle2D (3, 5, 2.3): " + c1.overlaps(new Circle2D(3, 5, 2.3)));
	}

}
