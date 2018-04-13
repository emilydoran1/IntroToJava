
public class Problem13_9 {

	public static void main(String[] args) {
		//create 3 circles
		Circle c1 = new Circle(2.2, "red", true);
		Circle c2 = new Circle(5.6, "blue", false);
		Circle c3 = new Circle(2.2, "green", true);
		
		//print out circle info
		c1.printCircle();
		c2.printCircle();
		c3.printCircle();
		
		System.out.println();
		
		//compare c1 to c2
		if(c1.equals(c2)) 
			System.out.println("C1 is equal to C2");
		else
			System.out.println("C1 is not equal to C2");
		
		//compare c1 to c3
		if(c1.equals(c3)) 
			System.out.println("C1 is equal to C3");
		else
			System.out.println("C1 is not equal to C3");
		//compare c2 to c3
		if(c2.equals(c3)) 
			System.out.println("C2 is equal to C3");
		else
			System.out.println("C2 is not equal to C3");
	}

}
