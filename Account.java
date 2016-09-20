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
		this(accountNumber, 0.0);
	}

	Account() {
		this(0000, 0.0);
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
		return String.format("A/C no: %d , Balance -$ %.2f", accountNumber, balance);
	}
	public static void main(String[] args) {

		Account account1 = new Account();
		Account account2 = new Account(51523);
		Account account3 = new Account(142131, 100.00);


		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);

		account1.accountNumber = 8782;
		account1.credit(12.0);
		account1.debit(10.0);

		account2.credit(100.0);
		account2.debit(50.0);

		account3.credit(1.0);
		account3.debit(25.13);

		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);
	}
}
