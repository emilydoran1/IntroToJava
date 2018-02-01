import java.util.Scanner;

public class Problem4_21 {

	public static void main(String[] args) {
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		//prompt user to enter their SSN
		System.out.println("Enter a SSN: ");
		String userSsn = input.next();
		
		//check if it is a valid SSN
		boolean valid = false;
		if((userSsn.length() == 11) && 
			(Character.isDigit(userSsn.charAt(0))) && (Character.isDigit(userSsn.charAt(1))) &&
			(Character.isDigit(userSsn.charAt(2))) && (userSsn.charAt(3) == '-') &&
			(Character.isDigit(userSsn.charAt(4))) && (Character.isDigit(userSsn.charAt(5))) &&
			(Character.isDigit(userSsn.charAt(7))) && (userSsn.charAt(6) == '-') &&
			(Character.isDigit(userSsn.charAt(8))) && (Character.isDigit(userSsn.charAt(9))) &&
			(Character.isDigit(userSsn.charAt(10)))) {
				valid = true;
		}
			

		//print out response
		if(valid)
			System.out.println(userSsn + " is a valid social security number");
		else
			System.out.println(userSsn + " is an invalid social security number");
				
	}

}
