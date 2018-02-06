import java.util.Scanner;

public class Problem5_1 {

	public static void main(String[] args) {
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter unspecified number of integers
		int count = 0;
		int numPositive = 0;
		int numNegative = 0;
		double total = 0;
		
		System.out.print("Enter an integer, the input ends if it is 0");
		int num = input.nextInt();
		
		if(num == 0)
			System.out.println("No numbers are entered except 0");
		
		while(num != 0) {
			if(num > 0)
				numPositive++;
			else
				numNegative++;
			count++;
			total += num;
			num = input.nextInt();
		}
		
		//compute average
		double average = total/count;
		
		//print out results
		if(count != 0) {
			System.out.println("The number of positives is " + numPositive);
			System.out.println("The number of negatives is " + numNegative);
			System.out.println("The total is " + total);			
			System.out.println("The average is " + average);
		}

	}

}
