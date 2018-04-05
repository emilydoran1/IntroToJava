import java.util.ArrayList;
import java.util.Scanner;

public class Problem11_11 {

	public static void main(String[] args) {
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		//create an ArrayList
		ArrayList<Integer> myList = new ArrayList<Integer>();
		
		//prompt user to enter 5 numbers
		System.out.println("Enter 5 numbers: ");
		
		//store numbers in an ArrayList
		for(int i = 0; i < 5; i++) {
			myList.add(input.nextInt());
		}
		
		//call method
		sort(myList);
		
		System.out.println(myList);
	}
	
	/**method sorts an ArrayList of numbers*/
	public static void sort(ArrayList<Integer> list) {
		java.util.Collections.sort(list);
	}

}
