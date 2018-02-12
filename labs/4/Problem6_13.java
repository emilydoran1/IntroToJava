
public class Problem6_13 {

	public static void main(String[] args) {
		System.out.println("i             m(i)");
		System.out.println("-----------------------");
		
		for (double i = 1; i <= 20; i++) {
			System.out.printf("%-12.0f", i);
			System.out.printf("%8.4f", summation(i));
			System.out.println();
		}
	}
	
	public static double summation(double i) {
		double sum = 0.0;
		for(double j = 1; j <= i; j++) {
			sum += j / (j + 1);
		}
		return sum;
	}

}
