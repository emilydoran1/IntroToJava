import java.util.Scanner;

public class Problem4_13 {

	public static void main(String[] args) {
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter a letter
		System.out.print("Enter a letter: ");
		String letter = input.next();
		char myLetter = letter.charAt(0);
		
		//check whether the letter is a vowel, consonant or invalid
		if(Character.isLetter(myLetter)) {
			switch(myLetter) {
				case 'a':
				case 'A':
				case 'e':
				case 'E':
				case 'i':
				case 'I':
				case 'o':
				case 'O':
				case 'u':
				case 'U':
					System.out.println(letter + " is a vowel");
					break;
				default:
					System.out.println(letter + " is a consonant");
			}
		}
		else
			System.out.println(letter + " is an invalid input");

	}

}
