import java.util.Scanner;

public class Problem6_5 {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter 3 numbers
		System.out.println("Enter 3 numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		//display the sorted numbers in increasing order
		displaySortedNumbers(number1, number2, number3);
	}
	
	//create method displaySortedNumbers
	public static void displaySortedNumbers(double num1, double num2, double num3) {
		double temporaryNum;
		if(num2 < num1 && num2 < num3) {
			temporaryNum = num1;
			num1 = num2;
			num2 = temporaryNum;
		}
		else if(num3 < num1 && num3 < num2) {
			temporaryNum = num1;
			num1 = num3; 
			num3 = temporaryNum;
		}
		if(num3 < num2) {
			temporaryNum = num2;
			num2 = num3;
			num3 = temporaryNum;
		}
		
		System.out.println(num1 + " " + num2 + " " + num3);
	}

}
