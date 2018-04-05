import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise12_13 {
	
	public static void main(String[] args) throws FileNotFoundException {
		//check that there is only one parameter entered
		if(args.length != 1) {
			System.out.println("Usage: java filename");
			System.exit(1);
		}
		
		//check to make sure file exists and if not print out message
		File file = new File(args[0]);
		if(!file.exists()) {
			System.out.println("File " + args[0] + " does not exist");
			System.exit(2);
		}
		
		//create variables to hold number of characters, words, and lines
		int numberOfCharacters = 0;
		int numberOfWords = 0;
		int numberOfLines = 0;
		
		try(
			//create input file by creating a scanner
			Scanner input = new Scanner(file);
		)
		{
			//get number of characters 
			while(input.hasNext()) {
				numberOfLines++;
				String currentLine = input.nextLine();
				numberOfCharacters += currentLine.length();	
			}
		}
		
		try(
			//create input file by creating a scanner
			Scanner input = new Scanner(file);
		)
		{
			//get number of words 
			while(input.hasNext()) {
				String currentLine =  input.nextLine();
				numberOfWords++;
			}
		}
		
		//print out the number of characters, words, and lines
		System.out.println("File " + file.getName() + " has\n" +
				numberOfCharacters + " characters\n" +
				numberOfWords + " words\n" +
				numberOfLines + " lines");

		}
	
}
