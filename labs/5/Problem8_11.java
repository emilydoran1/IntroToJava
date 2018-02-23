import java.util.Scanner;

public class Problem8_11 {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter a number between 0 and 511
		System.out.print("Enter a number between 0 and 511: ");
		int num = input.nextInt();
		
		//create a 3x3 array to store the values
		//int[][] myArray = new int[3][3];
		
		//convert the num to a binary number
		String binaryNum = Integer.toBinaryString(num);
		
		//add zeros in to binary num
		while(binaryNum.length() != 9) {
			binaryNum = "0" + binaryNum;
		}
		
		//Print out the values in binaryNum using H and T
	    for (int i = 1; i < 10; i++) {
	        if (binaryNum.charAt(i - 1) == '0') {
	            System.out.print("H ");
	        } else {
	            System.out.print("T ");
	        }

	        //get a new line after 3 letters are printed
	        if (i % 3 == 0) {
	            System.out.println();
	        }
	    }
		
	}

}
