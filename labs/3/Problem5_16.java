import java.util.Scanner;

public class Problem5_16 {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		int factor = 2;
		
		//find the smallest factors
		while(num/ factor != 1) {
			if(num % factor == 0) {
				System.out.print(factor + ", ");
				num = num/factor;
			}
			else
				factor++;
			
		}
		System.out.print(num + ".");
		
		//display the factors in increasing order
	}

}
