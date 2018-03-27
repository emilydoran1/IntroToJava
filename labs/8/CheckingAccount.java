
public class CheckingAccount extends Account {
	//create instance variable 
	private double overdraftLimit;
	
	/**default constructor*/
	public CheckingAccount(){
		super();
		overdraftLimit = -50;
	}
	
	/**constructor that creates object with specified values*/
	public CheckingAccount(int id, double balance, double overdraftLimit) {
		super(id, balance);
		this.overdraftLimit = overdraftLimit;
	}

	/**accessor method for overdraftLimit*/
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	/**mutator method for overdraftLimit*/
	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	/**represents withdrawing money and decreases balance*/
	@Override
	public void withdraw(double amount) {
		if (super.getBalance() - amount > overdraftLimit) {
			super.setBalance(getBalance() - amount);
		}
		else
			System.out.println("Amount exceeds overdraft limit.");
	}

	/** Return a String decription of CheckingAccount class */
	@Override
	public String toString() {
		return super.toString() + "\nOverdraft limit: $" + overdraftLimit;
	}
}
