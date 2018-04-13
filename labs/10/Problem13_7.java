
public class Problem13_7 {

	public static void main(String[] args) {
		//create an array of 5 GeometricObjects
		GeometricObject[] myGeometricObjects = {
				new Square(8.8),
				new Square(2.2),
				new Square(10.1),
				new Square(5),
				new Square(3.8)};
		
		for(int i = 0; i < myGeometricObjects.length; i++) {
			System.out.println("Geometric Object #" + (i+1));
			System.out.println("\tArea: " + myGeometricObjects[i].getArea());
			System.out.print("\tHow to Color: " );
			((Square) myGeometricObjects[i]).howToColor();
			System.out.println();
		}

	}

}
