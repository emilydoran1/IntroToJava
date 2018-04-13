
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {
	//create private double data field, side
	private double side;
	
	/**no argument constructor that creates an Octagon with side 0*/
	public Octagon() {
		side = 0;
	}
	
	/**constructor that creates an Octagon with specified side value*/
	public Octagon(double side) {
		this.side = side;
	}
	
	/**returns length of a side*/
	public double getSide() {
		return side;
	}
	
	/**sets the value of a side*/
	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double getArea() {
		double area = (2 + 4 / Math.sqrt(2)) * side * side;
		return area;
	}
	
	/**returns the perimeter of the octagon*/
	public double getPerimeter() {
		double perimeter = 8 * side;
		return perimeter;
	}

	@Override
	public int compareTo(Octagon octagon) {
		if(getArea() > octagon.getArea())
			return 1;
		else if(getArea() < octagon.getArea())
			return -1;
		else 
			return 0;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
