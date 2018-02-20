import java.util.Scanner;

public class Problem8_1 {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter the elements in the matrix row by row
		System.out.println("Enter a 3-by-4 matrix row by row: ");

		//create a 3 x 4 matrix array
		double[][] matrix = new double[3][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = input.nextDouble();
        }
		//print out the sums
		for(int i = 0; i < matrix[0].length; i++) {
			System.out.println("Sum of elements at column " + i + " is " + sumColumn(matrix, i));
		}
	}

	/** Method that returns the sum of all the elements in a specified column in a matrix */
	public static double sumColumn(double[][] m, int columnIndex) {
		double sum = 0;
		for(int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		return sum;
	}
	
}//end class
