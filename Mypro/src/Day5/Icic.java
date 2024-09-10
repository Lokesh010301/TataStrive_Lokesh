package Day5;

public class Icic extends Gpay
{
	private double Balance=7000;
	private int pin=1234;
	
	@Override
	public void makePayment(double amount)
	{
		if(amount<Balance)
		{
			Balance-=amount;
			String transDetails="payment of Rs." + amount+ "\n Made using Icici";
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
