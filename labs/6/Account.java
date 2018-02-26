import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	/**Default Constructor*/
	public Account() {
		setId(0);
		setBalance(0);
		setAnnualInterestRate(0);
	}
	
	public Account(int id, double balance) {
		this.setId(id);
		this.setBalance(balance);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return getAnnualInterestRate() / 12;
	}
	
	public double getMonthlyInterest() {
		return (getMonthlyInterestRate() / 100) * balance;
	}
}
