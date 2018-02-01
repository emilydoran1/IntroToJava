import java.util.Scanner;

public class Problem4_9 {

	public static void main(String[] args) {
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter a character
		System.out.print("Enter a character: ");
		String character = input.next();
		
		//convert the character to unicode
		char myChar = character.charAt(0);
		
		//print out the unicode for the character
		System.out.println("The Unicode for the character " + character + " is " + 
				(int)myChar);
	}

}
