import java.util.Scanner;

public class Problem7_5 {
	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		int[] distinctNum = new int[10]; 
		int num; 		
		int count = 0;	
		
		// Prompt the user 
		System.out.print("Enter ten numbers: ");
			
		for (int i = 0; i < 10; i++) {
			num = input.nextInt();
			if (isDistinctNumber(distinctNum, num)) {
				distinctNum[count] = num;
				count++;	// Increment count
			}
				
		}

		//display the number of distinct numbers
		System.out.println("The number of distinct numbers is " + count);
		
		//display the distinct numbers
		System.out.print("The distinct numbers are");
		for (int i = 0; i < distinctNum.length; i++) {
			if (distinctNum[i] > 0)
				System.out.print(" " + distinctNum[i]);
		}
		System.out.println();
	}
	
	//create method to see if the number is distinct
	public static boolean isDistinctNumber(int[] myArray, int number) {
		for (int i = 0; i < myArray.length; i++) {
			if (number == myArray[i]) 
				return false;
		}
		return true;
	}

}
