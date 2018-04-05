
public class IllegalTriangleException extends Exception{
	//create 3 double data fields
		private double side1;
		private double side2;
		private double side3;
		
		/**modify constructor from Triangle class to throw an IllegalTriangleException*/
		public IllegalTriangleException(double side1, double side2, double side3) {
			super("Illegal sides are: " + side1 + " " + side2 + " " + side3);
			this.side1 = side1;
			this.side2 = side2;
			this.side3 = side3;
		}
}
