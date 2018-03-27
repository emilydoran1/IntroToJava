
public class AccountTest {

	public static void main(String[] args) {
		//create objects of Account, SavingsAccount, and CheckingAccount
		Account myAcct = new Account(1001, 12000.20);
		SavingsAccount mySavingsAcct = new SavingsAccount(1100, 250000.65);
		CheckingAccount myCheckingAcct = new CheckingAccount(1222, 5000.12, -15);
		
		//withdraw $1000 from each account
		myAcct.withdraw(1000);
		mySavingsAcct.withdraw(1000);
		myCheckingAcct.withdraw(1000);
		
		//deposit $2000 to each account
		myAcct.deposit(2000);
		mySavingsAcct.deposit(2000);
		myCheckingAcct.deposit(2000);
		
		//invoke the different toString() methods
		System.out.println(myAcct.toString());
		System.out.println(mySavingsAcct.toString());
		System.out.println(myCheckingAcct.toString());
	}

}
