import java.util.Scanner;

public class A1Paper {

  public static void main(String[] args) {
	  //create a scanner;
	  Scanner input = new Scanner(System.in);
	  
	  // Read input from user
	  int myArray = input.nextInt();
	  int[] sheets = new int[myArray]; 
	  
	  for (int i = 1; i < myArray; i++) {
		  sheets[i] = input.nextInt();
	  }
		
	  //compute tape needed
	  double[] tape = new double[myArray];
	  for (int i = 1; i < myArray; i++) {
		  tape[i] = Math.pow(2, ((double)(-1 - i * 2)) / 4.0);
	  }

	  double tapeNeeded = 0;
	  int nextSize = 1;
	  for (int i = 0; i < myArray; i++) {
		  tapeNeeded += tape[i] * ((double)(nextSize / 2));

		  //enough pages to create a1 paper
		  if (sheets[i] >= nextSize) {
			  nextSize = 0;
			  break;  
		  } 
		  //not enough pages 
		  else
			  nextSize = (nextSize - sheets[i]) * 2;
	  	}

	  //Print results
	  if (nextSize <= 0)
		  System.out.println(tapeNeeded);	  
	  else
		  System.out.println("impossible");
		  
  }

}