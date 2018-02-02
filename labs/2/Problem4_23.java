import java.util.Scanner;

public class Problem4_23 {

	public static void main(String[] args) {
		//create a Scanner
		Scanner input = new Scanner(System.in);
		
		//prompt for name, number of hours worked in a week, hourly pay rate,
		//federal tax withholding rate, and state tax withholding rate
		
		System.out.print("Enter employee's name: ");
		String name = input.next();
		
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double fedTaxRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();
		
		//calculate gross pay, deductions, and net pay
		double grossPay = payRate * hours;
		double fedTaxDeduction = grossPay * fedTaxRate;
		double stateTaxDeduction = grossPay * stateTaxRate;
		double totalDeduction = fedTaxDeduction +stateTaxDeduction;
		double netPay = grossPay - totalDeduction;
		
		//print out information 
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours);
		System.out.println("Pay Rate: $" + payRate);
		System.out.println("Gross Pay: $" + grossPay);
		System.out.println("Deductions:");
		System.out.println("\t Federal Withholding (" + fedTaxRate* 100 + "%): $" + 
				fedTaxDeduction);
		System.out.println("\t State Withholding (" + stateTaxRate* 100 + "%): $" + 
				stateTaxDeduction);
		System.out.printf("\t Total Deduction: $%.2f \n", totalDeduction);
		System.out.printf("Net Pay: $%.2f", netPay);
	}

}
