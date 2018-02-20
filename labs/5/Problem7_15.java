import java.util.Scanner;

public class Problem7_15 {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//create an array to hold the numbers
		int[] myArray = new int[10];
		
		//prompt user to enter 10 integers
		System.out.print("Enter 10 numbers: ");
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = input.nextInt();
		}
		
		// print out results
		printArray(eliminateDuplicates(myArray));
	}
	
	/** Method that returns a new array by eliminating the duplicate values in the array*/
	 public static int[] eliminateDuplicates(int[] list) {
	 	 //create a temporary array to hold the values 
		 int[] tempArray = new int[list.length];
	       int index = 0;
	       for (int i = 0; i < list.length; i++) {
	           boolean isDuplicate = false;
	           for (int k = 0; k < list.length; k++) {
	        	   	// checks if the element is a duplicate number
	               if (tempArray[k] == list[i]) {
	                   isDuplicate = true;
	               }
	           }
	           if (!isDuplicate) {
	               tempArray[index++] = list[i];
	           }
	       }
	       
	       //create a new array to hold the final values of the distinct numbers
	       int[] newArray = new int[index];
	       for (int i = 0; i < index; i++) {
	           newArray[i] = tempArray[i];
	       }

	       return newArray;
	   }
	
	/** Method to print results */
	 public static void printArray(int[] myArray) {
		 
		 //print each item in array
		 System.out.print("The distinct numbers are: ");
         for (int i = 0; i < myArray.length; i++) {
             System.out.print(myArray[i] + " ");    
         }
	 }
	 
}
