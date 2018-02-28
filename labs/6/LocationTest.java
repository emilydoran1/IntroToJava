import java.util.Scanner;

public class LocationTest {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter a 2D array
		System.out.print("Enter the number of rows and columns in the array: ");
		int row = input.nextInt();
		int col = input.nextInt();
		
		//initialize myArray to values input by user
		double[][] myArray = new double[row][col];
		System.out.println("Enter the array: ");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				myArray[i][j] = input.nextDouble();
			}
		}
		
		//create a Location object and call method locate largest using myArray as parameter
		Location location = new Location();
		location = Location.locateLargest(myArray);
		
		//display the location of the largest element in the array
		System.out.println("The location of the largest element is " + location.maxVal + 
				" at (" + location.row + ", " + location.col + ")");
	}

}
