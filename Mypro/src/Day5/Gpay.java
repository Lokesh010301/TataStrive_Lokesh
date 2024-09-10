package Day5;

import java.util.ArrayList;

public abstract class Gpay {
	   private static ArrayList<String> transation=new ArrayList<String>();
	   
       public abstract void makePayment(double amount);
       public abstract void checkBalance(int pin);
       
       public void commonFeatures()
       {
    	   System.out.println("Processing payment through GPay platform");
       }
       
	  public void recordtrans(String trasDeltails)
	  {
		  transation.add(trasDeltails);
	  }
	  public void showHistory()
	  {
		  transation.forEach(s->System.out.println(s));
	  }

}
