import java.util.Date;

public class Problem9_3 {

	public static void main(String[] args) {
		Date myDate = new Date();
		
		for(long i = 10000; i <= 1e11; i *= 10) {
			myDate.setTime(i);
			System.out.println(i + ": " + myDate.toString());
		}
	
	}

}
