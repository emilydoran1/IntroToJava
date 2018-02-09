
public class Problem6_1 {

	public static void main(String[] args) {
		//display the first 100 pentagonal numbers
		for(int i = 1; i <= 100; i++) {
			if(i % 10 == 0) {
				System.out.printf("%7d\n", getPentagonalNumber(i));
			}
			else {
				System.out.printf("%7d", getPentagonalNumber(i));
			}
		}
		
	}
	//create method getPantagonalNumber
	public static int getPentagonalNumber(int n) {
		return (n * (3*n - 1)) / 2;
	}
	
}
