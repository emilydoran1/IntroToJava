import java.util.Scanner;

public class Problem3_17 {

	public static void main(String[] args) {
		//Generate a random number: 0, 1, or 2
		int randomNum = (int)(Math.random() * 3);
		
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter 1, 2, or 3
		System.out.print("scissor(0), rock(1), paper(2): ");
		int userNum = input.nextInt();
		
		//determine who won
		String winner;
		if(randomNum > userNum && userNum != 0)
			winner = "The computer won.";
		else if(randomNum < userNum && randomNum != 0)
			winner = "You won.";
		else if(randomNum > userNum && userNum == 0)
			winner = "You won.";
		else if(randomNum < userNum && randomNum == 0)
			winner = "The computer won.";
		else
			winner = "It is a draw.";
		
		//determine if numbers are rock, paper, or scissor
		String computerAnswer = "";
		switch(randomNum) {
			case 0:
				computerAnswer = "scissor";
				break;
			case 1:
				computerAnswer = "rock";
				break;
			case 2:
				computerAnswer = "paper";
		}
		
		String userAnswer = "";
		switch(userNum) {
		case 0:
			userAnswer = "scissor";
			break;
		case 1:
			userAnswer = "rock";
			break;
		case 2:
			userAnswer = "paper";
	}
		
		//print out message saying who wins
		System.out.println("The computer is " + computerAnswer + ". You are " + userAnswer + 
				". " + winner);
		
	}

}
