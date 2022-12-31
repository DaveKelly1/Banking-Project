import java.util.Random;

import interfaces.iAccount;

public class Account extends Customer implements iAccount {
	private int funds;
	private int accountNo;
	private int accountID;
	private String name;

	public Account() {
		funds = 0;
		accountNo = accountNumber();
		accountID = accountIDRandom();
		name = "";
	}

	public int accountNumber() {
		Random random = new Random();
		int acctNo = 100000 + random.nextInt(999999);
		return acctNo;
	}

	public int accountIDRandom() {
		Random random = new Random();
		int id = 1000000 + random.nextInt(9999999);
		return id;
	}

	public int displayFunds() {
		return funds;
	}

	public String returnName() {
		return name;
	}

	public int returnAccountNo() {
		return accountNo;
	}

	public int returnAccountID() {
		return accountID;
	}

	public void deposit(int sum) {
		if (sum < 1) {
			System.out.println("Please enter a valid amount");
		}
		funds += sum;
	}

	public void withdraw(int sum) {
		if (funds - sum >= 0) {
			funds -= sum;
			System.out.println("You have withdrawn £" + sum);
		}
		System.out.println("Insufficient funds");
	}

	public boolean checkPositiveFunds() {
		return (funds > 0);
	}

}
