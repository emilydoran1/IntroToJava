
public class MyInteger {
	//create instance variable "value"
	private int value;
	
	//constructor
	public MyInteger(int value) {
		this.value = value;
	}
	//getter method for int value
	public int getValue() {
		return value;
	}
	//returns true if value is even
	public boolean isEven() {
		boolean isEven = false;
		if((value % 2) == 0)
			isEven = true;
		return isEven;
	}
	//returns true if value is odd
	public boolean isOdd() {
		boolean isOdd = false;
		if((value % 2) == 1)
			isOdd = true;
		return isOdd;
	}
	//returns true if value is a prime number
	public boolean isPrime() {
		boolean isPrime = true;
		for(int i = 2; i <= value / 2; i++) {
			if((value % i) == 0)
				isPrime = false;
		}
		return isPrime;
	}
	
	//returns true if the specified integer is even
	public static boolean isEven(int x) {
		boolean isEven = false;
		if((x % 2) == 0)
			isEven = true;
		return isEven;
	}
	//returns true if the specified integer is odd
	public static boolean isOdd(int x) {
		boolean isOdd = false;
		if((x % 2) == 1)
			isOdd = true;
		return isOdd;
	}
	//returns true if the specified integer is prime
	public static boolean isPrime(int x) {
		boolean isPrime = true;
		for(int i = 2; i <= x / 2; i++) {
			if((x % i) == 0)
				isPrime = false;
		}
		return isPrime;
	}
	
	//returns true if the specified integer is even
	public static boolean isEven(MyInteger myInt) {
		return myInt.isEven();
	}
	//returns true if the specified integer is odd
	public static boolean isOdd(MyInteger myInt) {
		return myInt.isOdd();
	}
	//returns true if the specified integer is prime
	public static boolean isPrime(MyInteger myInt) {
		return myInt.isPrime();
	}
	
	//returns true if x is equal to value
	public boolean equals(int x) {
		boolean equal = false;
		if(x == value) {
			equal = true;
		}
		return equal;
	}
	//returns true if the object is equal to the specified value
	public boolean equals(MyInteger myInt) {
		boolean equal = false;
		if(myInt.value == this.value)
			equal = true;
		return equal;
	}
	
	//converts an array of numeric characters into an int value
	public static int parseInt(char[] myChar) {
		int intValue = 0;
		for (int i = 0, j = (int) Math.pow(10, myChar.length - 1); 
			  i < myChar.length; i++, j /= 10) {
			intValue += (myChar[i]- 48) * j;
		}
		return intValue;
	}
	//converts a string into an int value
	public static int parseInt(String myString) {
		int intValue = 0;
		for (int i = 0, j = (int)Math.pow(10, myString.length() - 1); 
			  i < myString.length(); i++, j /= 10) {
			intValue += (myString.charAt(i) - 48) * j;
		}
		return intValue;
	}
}
