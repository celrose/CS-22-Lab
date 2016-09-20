public class TestAccount{
	public static void main(String[] args) {

		Account account1 = new Account();
		Account account2 = new Account(51523);
		Account account3 = new Account(142131, 100.00);

		System.out.println(account1);
		System.out.println(account2);
		System.out.println(account3);

		//account1.accountNumber = 8782;
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
