import java.util.Scanner;

public class Problem7_11 {
	
	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//create an array
		double[] myArray = new double[10];
		
		//prompt user to enter 10 numbers
		System.out.print("Enter 10 numbers: ");
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = input.nextDouble();
		}
		
		//print results
		System.out.printf("The mean is %.2f",mean(myArray));
		System.out.println();
		System.out.printf("The standard deviation is %.5f", deviation(myArray));
	}
	
	/** compute the deviation of double values */
	public static double deviation(double[] x){
		double mean = mean(x);
		double stDev = 0;
		for(int i = 0; i < x.length; i++) {
			stDev += ((x[i] - mean) * (x[i] - mean));
		}
		stDev = Math.sqrt(stDev / (x.length - 1));
		return stDev;
	}
	
	/** compute the mean of an array of double values*/
	public static double mean(double[] x) {
		double total = 0;
		double mean;
		for(int i = 0; i < x.length; i++) {
			total += x[i];		
		}
		mean = total / x.length;
		return mean;
	}
}
