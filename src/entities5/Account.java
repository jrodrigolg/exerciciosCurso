package entities5;

public class Account {
	private int accountNumber;
	private String accountHolder;
	private double value;

	public Account(int accountNumber, String accountHolder, double value) {

		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.value = value;
	}

	public Account(int accountNumber, String accountHolder) {

		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public double getValue() {
		return value;
	}

	public void deposit(double value) {
		this.value += value;
	}

	public void withdraw(double value) {
		this.value -= (value+5);
	}

	public String toString() {
		 return "Account: "
					+ getAccountNumber()
					+" Holder: "
					+ getAccountHolder() 
					+ ", Balance: $ "
					+ String.format("%.2f", getValue());
	 }
}
