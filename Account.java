/*
 * mp5.2 by racadavos 9/13/2016
 */
public class Account {
	
	private int accountNumber;
	private double balance;

	Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	Account(int accountNumber) {

	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void credit(double amount) {
		balance += amount;
	}
	public void debit(double amount) {
		if (balance >= amount) {
			balance -= amount;
		} else {
			throw new IllegalArgumentException("Amount withdrawn exceeds the current balance.");
		} 
	}
	public String toString() {
		return String.format("A/C no: %d , Balance -$ %.2f", this.accountNumber, this.balance);
	}
	public static void main(String[] args) {
		Account account = new Account(123, 100.00);
		System.out.println(account);

		account.credit(12.0);
		System.out.println(account.balance);
		System.out.println(account);

		account.debit(13.11);
		System.out.println(account.balance);
		System.out.println(account);

		Account account2 = new Account(2113, 50.00);
		account2.debit(51.00);
		System.out.println(account2);		

	}
}