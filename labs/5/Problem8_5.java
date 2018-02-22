import java.util.Scanner;

public class Problem8_5 {
	
	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//create 2 matrices
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		
		//prompt user to enter 2 matrices
		System.out.print("Enter matrix 1: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix1[i][j] = input.nextDouble();
			}
		}
		
		System.out.print("Enter matrix 2: ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				matrix2[i][j] = input.nextDouble();
			}
		}
		
		//initialize matrix3 to sum of matrix1 and matrix2
		double[][] matrix3 = addMatrix(matrix1, matrix2);
		
		//print out how the matrices are added
		System.out.println("The matrices are added as follows");
		printMatrix(matrix1, matrix2, matrix3);
		
	}
	
	/** Method to add two matrices */
	public static double[][] addMatrix(double[][] a, double[][] b){
		//create new matrix
		double[][] sumMatrices = new double[a.length][a[0].length];
		
		for(int i = 0; i < sumMatrices.length; i++) {
			for(int j = 0; j < sumMatrices[i].length; j++) {
				sumMatrices[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return sumMatrices;
	}
	
	/** Method that prints each element in a row*/
	public static void print(double[][] matrix, int row) {	
		for (int j = 0; j < matrix[row].length; j++) {
			System.out.print(matrix[row][j] + " ");
		}	
	}

	
	/** Method to print out the matrix */
	public static void printMatrix(double[][] matrix1, double[][] matrix2, double[][] matrix3){
		for (int i = 0; i < 3; i++) {
			print(matrix1, i);
			System.out.print((i == 1 ? "  +  " : "     "));
			print(matrix2, i);
			System.out.print((i == 1 ? "  =  " : "     "));
			print(matrix3, i);
			System.out.println();
		}
	}

}
