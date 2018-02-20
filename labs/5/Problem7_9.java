import java.util.Scanner;

public class Problem7_9 {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//create an array to hold the 10 numbers
		double[] myArray = new double[10];
		
		//prompt user to enter 10 numbers 
		System.out.print("Enter 10 numbers: ");
		for(int i = 0; i < 10; i++) {
			myArray[i] = input.nextDouble();
		}
		
		//return the smallest value in array
		System.out.println("The minimum number is " + min(myArray));
	}
	
	/** Method to find the smallest element in an array of double values */
	public static double min(double[] array) {
		//set min equal to first element in array
		double min = array[0];
		
		//traverse array to find smallest element
		for(int i = 1; i < array.length; i++) {
			if(array[i] < min) 
				min = array[i];
		}
		return min;
	}

}
