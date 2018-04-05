import java.io.*;
import java.util.*;

public class Exercise12_11 {

	public static void main(String[] args) throws FileNotFoundException {
		//check parameter usage and make sure that the user enters only 2 parameters
		if(args.length != 2) {
			//if user does not enter 2 parameters, remove
			System.out.println("Usage: java RemoveText fileName");
			System.exit(1);
		}
		
		//check to make sure file exists and if not print out message
		File file = new File(args[1]);
		if(!file.exists()) {
			System.out.println("File " + args[1] + " does not exist");
			System.exit(2);
		}
		
		//create an ArrayList of type String
		ArrayList<String> myArrayList = new ArrayList<>();
		try(
			//create input file by creating a scanner
			Scanner input = new Scanner(file);
		){
			//adds removeString() removed elements to myArrayList  
			while (input.hasNext()) {
				String myString = input.nextLine();
				myArrayList.add(removeString(args[0], myString));
			}
		}
		
		try(
			//create output file
			PrintWriter output = new PrintWriter(file);
		){
			//print out each element in myArrayList
			for (int i = 0; i < myArrayList.size(); i++) {
				output.println(myArrayList.get(i));
			}
		}
		
	}

	/**method removes all occurrences of the given string from a text file*/
	public static String removeString(String string, String fileName) {
		//create a string of the given file
		StringBuilder myStringBuilder = new StringBuilder(fileName);
		
		//find start index of the string
		int startIndex = myStringBuilder.indexOf(string);
		
		//find end index of the string
		int endIndex = string.length();
		
		while(startIndex >= 0) {
			endIndex += startIndex;
			
			//delete the string from startIndex to endIndex
			myStringBuilder = myStringBuilder.delete(startIndex, endIndex);
			
			//reset the startIndex to search for more occurrences of the string
			startIndex = myStringBuilder.indexOf(string, startIndex);
		}
		
		//return the new string without the occurrences of the given string
		return myStringBuilder.toString();
	}

}
