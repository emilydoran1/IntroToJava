import java.util.Scanner;

public class Problem7_3 {

	public static void main(String[] args) {
		//create a scanner
		Scanner input = new Scanner(System.in);
		
		//create an array
		int counts[] = new int[100];
		
		//prompt the user to enter integers between 1 and 100
		System.out.println("Enter the integers between 1 and 100");
		int num; // holds user input
		do {
				num = input.nextInt();
				if (num >= 1 && num <= 100)	
						counts[num - 1]++;
			} 
		while (num != 0);
		
		for (int i = 0; i < counts.length; i++) {
			if (counts[i] == 1) {
				System.out.println((i + 1) + " occurs " + counts[i] + " time");
			}
			else if (counts[i] > 1){
				System.out.println((i + 1) + " occurs " + counts[i] + " times");
			}
		}
	}

}
