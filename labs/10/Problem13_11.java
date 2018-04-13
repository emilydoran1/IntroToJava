
public class Problem13_11 {

	public static void main(String[] args) throws CloneNotSupportedException {
		//create an Octagon object with side 5
		Octagon o1 = new Octagon(5);
		
		//display area and perimeter of octagon
		System.out.println("The area of the octagon is: " + o1.getArea());
		System.out.println("The perimeter of the octagon is: " + o1.getPerimeter());
		
		System.out.println();
		
		//create a new object using the clone method 
		Octagon o2 = (Octagon)o1.clone();
		
		//compare the 2 objects using the compareTo method
		if(o1.compareTo(o2) == 1)
			System.out.println("Octagon 1 is greater than it's clone.");
		else if(o1.compareTo(o2) == -1)
			System.out.println("Octagon 1 is less than it's clone.");
		else
			System.out.println("Octagon 1 is equal to it's clone.");
	}

}
