import java.util.Scanner;

public class Problem7_19 {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter the size of the list
		System.out.print("Enter the size of the list: ");
		int size = input.nextInt();
		
		//create an array 
		int[] array = new int[size];
		
		//prompt user to enter the contents of the list
		System.out.print("Enter the contents of the list: ");
		for(int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		
		//print out how many integers are in the array + the elements of the array
		System.out.print("The list has " + size + " integers ");
		for(int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}
		
		//print out the results
		System.out.println();
		if(isSorted(array)) 
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
	}
	
	/** Method to see whether an array is sorted or not */
	public static boolean isSorted(int[] list) {
		boolean isSorted = true;
		for(int i = 1; i < list.length; i++) {
			if(list[i] < list[i-1])
				isSorted = false;
		}
		
		return isSorted;
	}

}
