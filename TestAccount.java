public class TestAccount{
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