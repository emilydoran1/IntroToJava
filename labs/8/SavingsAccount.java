
public class SavingsAccount extends Account {
	
	/**default constructor*/
	public SavingsAccount() {
		super();
	}
	
	/**constructor that creates object with specified values*/
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}
	
	/**decrease balance by specified amount*/
	@Override
	public void withdraw(double amount) {
		if (amount < super.getBalance()) {
			super.setBalance(super.getBalance() - amount);
		}
		else
			System.out.println("Error!");
	}
	
	/**call super toString()*/
	public String toString() {
		return super.toString();
	}
}
