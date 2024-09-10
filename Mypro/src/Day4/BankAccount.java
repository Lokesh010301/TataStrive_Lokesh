package Day4;

public class BankAccount {
	
	private int accountNumber;
	private long balance;
	
	
	
	public BankAccount() {
		super();
	}


	public BankAccount(int accountNumber, long balance) 
	{
		
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	  public int deposit(int amt)
	{
		balance+=amt;
		return (int) balance;
	}
	public int withdraw(int amt)
	{
		balance-=amt;
		return (int) balance;
	}
}
