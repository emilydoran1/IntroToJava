import java.util.Scanner;

public class Problem12_3 {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//create an array with 100 randomly generated integers
		int[] myArray = new int[100];
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = (int)((Math.random() * 100) + 1);
		}
		
		//prompt user to enter the index of the array, then display the corresponding element value
		System.out.println("Enter the index of the array: ");
		int index = input.nextInt();
		
		//create try/catch to see if the specified index is out of bounds
		try {
			System.out.println("The corresponding element value is " + myArray[index]);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of bounds");
		}
		
	}

}
