package entities;

public class Operations {

	private int accountNumber;
	private String holder;
	private double balance;

	public double depositValue(double balance) {

		return this.balance += balance;

	}

	public double withdrawValue(double balance) {

		return this.balance -= (balance + 5);

	}

	public Operations(int accountNumber, String holder, double balance) {
		this.accountNumber = accountNumber;
		this.holder = holder;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
