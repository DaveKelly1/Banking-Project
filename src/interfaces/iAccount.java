package interfaces;

public interface iAccount {

    public int accountNumber();

    public int displayFunds();

    public int returnAccountID();

    public int accountIDRandom();

    public int returnAccountNo();

    public void deposit(int sum);

    public void withdraw(int sum);

    public boolean checkPositiveFunds();

}
