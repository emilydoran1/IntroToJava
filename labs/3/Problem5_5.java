
public class Problem5_5 {

	public static void main(String[] args) {
		//display kilograms 1-199 only odds and the pound equivalent
		final double POUNDS_TO_KILO = 2.2;
		
		System.out.println("Kilograms      Pounds    |    Pounds      Kilograms");
		for(int i = 1, j = 20; i <= 199 && j <= 515; i += 2, j += 5) {
			System.out.printf("%-12d%7.1f", i, (i * POUNDS_TO_KILO));	
			System.out.print("      |      ");
			System.out.printf("%-12d%5.2f", j, (j / POUNDS_TO_KILO));
			System.out.println();
			}
		
		
	}

}
