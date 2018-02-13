import java.util.Scanner;

public class Problem6_17 {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter a number
		System.out.print("Enter n: ");
		int n = input.nextInt();
		
		//call method
		printMatrix(n);
	}
	
	public static void printMatrix(int n) {		
		//use nested for loops to print matrix
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				
				//generate random int that is either 0 or 1
				int randNum = (int)(Math.random() * 2 );
				System.out.print(randNum + "  ");
			}
			System.out.println();
		}
	}

}
