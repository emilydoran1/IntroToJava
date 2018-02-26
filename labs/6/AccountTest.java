
public class AccountTest {

	public static void main(String[] args) {
		//create an object of type Account
		Account myAccount = new Account(1122, 20000);
		myAccount.setAnnualInterestRate(4.5);
		
		//withdraw $2,500 from account
		myAccount.withdraw(2500);
		
		//deposit $3,000 to account
		myAccount.deposit(3000);
		
		System.out.println("Balance: " + myAccount.getBalance() + "\nMonthly Interest: " + 
				myAccount.getMonthlyInterest() + "\nDate Created: " + myAccount.getDateCreated());
	}

}
