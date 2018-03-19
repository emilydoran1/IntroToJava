
public class MyIntegerTest {

	public static void main(String[] args) {
		//create 2 arrays of int to use for testing
		int[] myArray = {3, 4};
		int[] myArray2 = {7, 9};
		//create a char array
		char[] myCharacters = {'7', '8', '9'};
		
		//Test methods MyInteger(), isEven(), and getValue()
		System.out.println("Test if values are even using the method isEven():");
		for (int i = 0; i < myArray.length; i++) {
			//Create a MyInteger object
			MyInteger value = new MyInteger(myArray[i]);
			System.out.println(value.getValue() + " " + value.isEven());
		}
		//Test method isOdd()
		System.out.println("\nTest if values are odd using the method isOdd():");
		for (int i = 0; i < myArray.length; i++) {
			//Create a MyInteger object
			MyInteger value = new MyInteger(myArray[i]);
			System.out.println(value.getValue() + " " + value.isOdd());
			}
		//Test method isPrime()
		System.out.println("\nTest if values are prime using the method isPrime():");
		for (int i = 0; i < myArray.length; i++) {
			//Create a MyInteger object
			MyInteger value = new MyInteger(myArray[i]);
			System.out.println(value.getValue() + " " + value.isPrime());
		}
		
		//Test method isEven(int) 
		System.out.println("\nTest if values are even using the method isEven(int):");
		for (int i = 0; i < myArray.length; i++) 
			System.out.println(myArray[i] + " " + MyInteger.isEven(myArray[i]));
		//Test method isOdd(int)
		System.out.println("\nTest if values are odd using the method isOdd(int):");
		for (int i = 0; i < myArray.length; i++) 
			System.out.println(myArray[i] + " " + MyInteger.isOdd(myArray[i]));
		//Test method isPrime(int)
		System.out.println("\nTest if values are prime using the method isPrime(int):");
		for (int i = 0; i < myArray.length; i++) 
			System.out.println(myArray[i] + " " + MyInteger.isPrime(myArray[i]));

		//Test method isEven(MyInteger) 
		System.out.println("\nTest if values are even using isEven(MyInteger):");
		for (int i = 0; i < myArray.length; i++) {
			//Create a MyInteger object
			MyInteger value = new MyInteger(myArray[i]);
			System.out.println(value.getValue() + " " + MyInteger.isEven(value));
		}
		//Test method isOdd(MyInteger)
		System.out.println("\nTest if values are odd using isOdd(MyInteger):");
			for (int i = 0; i < myArray.length; i++) {
				//Create a MyInteger object
				MyInteger value = new MyInteger(myArray[i]);
				System.out.println(value.getValue() + " " + MyInteger.isOdd(value));
			}
		//Test method isPrime(MyInteger)
		System.out.println("\nTest if values are prime using isPrime(MyInteger):");
		for (int i = 0; i < myArray.length; i++) {
			//Create a MyInteger object
			MyInteger value = new MyInteger(myArray[i]);
			System.out.println(value.getValue() + " " + MyInteger.isPrime(value));
		}
		
		//Test method equals(int) 
		//Create a MyInteger object
		MyInteger value = new MyInteger(7);
		System.out.println("\nTest if " + value.getValue() + 
			" is equal to the specified value:");
		for (int i = 0; i < myArray2.length; i++) 
			System.out.println(myArray2[i] + " " + value.equals(myArray2[i]));
		//Test method equals(MyInteger)
		System.out.println("\nTest if " + value.getValue() + 
			" is equal to the specified value:");
		for (int i = 0; i < myArray2.length; i++) {
			MyInteger myInteger = new MyInteger(myArray2[i]);	
			System.out.println(myArray2[i] + " " + value.equals(myInteger));
		}
		
		//Test methods parseInt(char[]) and parseInt(String) by adding the two converted strings together
		System.out.println("\nTest parseInt(char[]) and parseInt(String):");
		//Create a string
		String myNumString = "145";
		System.out.print("\'");
		for (int i = 0; i < myCharacters.length; i++) 
		 	System.out.print(myCharacters[i] + "");
				
		System.out.println("\' + \"" + myNumString + "\" = " + 
				(MyInteger.parseInt(myCharacters) + 
				MyInteger.parseInt(myNumString)));
	}
}
