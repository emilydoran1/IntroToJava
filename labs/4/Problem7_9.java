import java.util.Scanner;

public class Problem7_9 {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//create an array
		double[] myArray = new double[10];
		
		//prompt user to enter 10 numbers
		System.out.print("Enter 10 numbers: ");
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = input.nextDouble();
		}
		
		//print out the minimum by calling method
		System.out.println("The minimum number is " + min(myArray));
	}
	//finds the smallest element in an array of doubles
	public static double min(double[] array) {
		double min = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

}
