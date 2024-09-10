package Day5;

public class Sbi extends Gpay

{
	private double Balance=13000;
	private int pin=1000;
	
	@Override
	public void makePayment(double amount)
	{
		if(amount<Balance)
		{
			Balance-=amount;
			String transDetails="payment of Rs." + amount+ "Made using Sbi";
			recordtrans(transDetails);
		}
	}

	@Override
	public void checkBalance(int pin) 
	{
		if(this.pin==pin) 
		{
			System.out.println("your balance is "+Balance);
		}
		else 
		{
			System.out.println("");
		}

	
	}
}
