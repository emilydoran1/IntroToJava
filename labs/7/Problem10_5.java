import java.util.Scanner;

public class Problem10_5 {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter a positive integer
		System.out.print("Enter a positive integer: ");
		int num = input.nextInt();
		
		//create a new stack of integers
		StackOfIntegers myStack = new StackOfIntegers();
		
		//call push method to add factors to myStack
		//create a temporary number that is the same value as num
		int tempNum = num;
		
		int i = 2;
		while((tempNum / i) != 1) {
			if((tempNum % i) == 0) {
				myStack.push(i);
				tempNum /= i;
			}
			else
				i++;
		}
		//add the remaining number as a factor
		myStack.push(tempNum);
		
		//display the integer's smallest factors in decreasing order
		System.out.print("The smallest factors of the number " + num + " are: ");
		while (!myStack.empty()) {
			System.out.print(myStack.pop() + " ");
		}
	}

}
