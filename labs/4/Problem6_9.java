
public class Problem6_9 {
	
	public static void main(String[] args) {
		System.out.println("Feet     Meters     |     Meters     Feet");
		System.out.println("-----------------------------------------------");
		for(double feet = 1.0, meters = 20.0; feet <= 10.0 && meters <= 65; feet++, meters +=5) {
			System.out.printf("%4.1f     ", feet);
			System.out.printf("%6.3f", footToMeter(feet));
			System.out.print("     |     ");
			System.out.printf("%-11.1f", meters);
			System.out.printf("%7.3f", meterToFoot(meters));
			System.out.println();
		}
		
	}
	/**convert from feet to meters */
	public static double footToMeter(double foot) {
		double meter = foot * 0.305;
		return meter;
	}
	
	/**convert from meters to feet */
	public static double meterToFoot(double meter) {
		double feet = meter * 3.279;
		return feet;
	}
}
