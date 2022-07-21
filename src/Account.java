import java.util.Random;

public class Account extends Customer {
	private int funds;
	private int accountNo;
	private int accountID;
	private String name;

	public Account(){
		funds = 0;
		accountNo = accountNoRandom();
		accountID = accountIDRandom();
		name = "";
	}

	public int accountNoRandom() {
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
		if(sum > 0) {
			funds += sum;
		}
		else {
			System.out.println("Please try again");
		}
	}
	
	public void withdraw(int sum) {
		funds -= sum;
	}

	public boolean checkPositiveFunds() {
		if(funds > 0) {
			return true;
		}
		return false;
	}

}
