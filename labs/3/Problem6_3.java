import java.util.Scanner;

public class Problem6_3 {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter an integet
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		
		//print out if the number is a palindrome 
		if(isPalindrome(num))
			System.out.println("The number " + num + " is a palindrome.");
		else
			System.out.println("The number " + num + " is not a palindrome.");
		
	}
	
	//create method reverse
	public static int reverse(int number) {
		String myNum = number + "";
		String reversedNum = "";
		for(int i = myNum.length() - 1; i >= 0; i--) {
			reversedNum += myNum.charAt(i);
		}
		return Integer.parseInt(reversedNum);
	}
	
	//create method isPalindrome
	public static boolean isPalindrome(int number) {
		boolean isPalindrome = false;
		if(number == reverse(number))
			isPalindrome = true;
		return isPalindrome;
	}

}
