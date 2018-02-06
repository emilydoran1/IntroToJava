
public class Problem5_13 {

	public static void main(String[] args) {
		//find the largest n such that n^3 < 12,000 using while loop
		int n = 0;
		while((n*n*n) < 12000) {
			n++;
		}
		n--;
		System.out.println("The largest n such that n^3 < 12,000 is: " + n +
				" and n^3 is: " + n*n*n);
	}

}
