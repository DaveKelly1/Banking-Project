import interfaces.iWithdraw;

public class Withdraw extends Account implements iWithdraw {
	private int funds;
	private int totalWithdrawn;
	private Account account;

	Withdraw() {
		account = new Account();

	}

	public void withdrawAmount(int sum) {
		if (account.checkPositiveFunds() == false) {
			System.out.println("You have insufficient finds to withdraw " + sum);
		}
		account.withdraw(sum);
		System.out.println("You have withdrawn £" + sum);
		System.out.println("You now have £" + account.displayFunds() + "remaining");
	}

}
