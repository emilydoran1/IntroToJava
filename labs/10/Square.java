
public class Square extends GeometricObject implements Colorable {
	//create a data field side
	private double side;
	
	/**no-arg constructor to create a square with side 0*/
	public Square() {
		side = 0;
	}
	
	/**constructor to create square with specified side*/
	public Square(double side) {
		this.side = side;
	}

	/**getter method for side*/
	public double getSide() {
		return side;
	}

	/**setter method for side*/
	public void setSide(double side) {
		this.side = side;
	}

	/**returns how to color a square*/
	@Override
	public void howToColor() {
		//displays message on how to color a square
		System.out.print("Color all four sides."); 

	}
	
	/**returns the area of a square*/
	@Override
	public double getArea() {
		double area = side * side;
		return area;
	}

}
