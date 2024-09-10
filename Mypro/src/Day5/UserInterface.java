package Day5;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Icic icici=new Icic();
		Sbi sbi=new Sbi();
		Scanner a=new Scanner(System.in);
		Gpay gpay=icici;
		int ch=0;
		do
		{
			System.out.println("User Interface.\n-----------------");
			System.out.println("1,Make Payment");
			System.out.println("2.Check Balance");
			System.out.println("3.see History");
			System.out.println("4.Switch Account");
			System.out.println("5.Exit");
			 ch=a.nextInt();
			 switch(ch)
			 {
			 case 1:
				 System.out.println("Enter the amount");
				 double amount=a.nextDouble();
				 gpay.makePayment(amount);
				 break;
			 case 2:
				 System.out.println("Enter the pin");
				 int pin=a.nextInt();
				 gpay.checkBalance(pin);
				 break;
			 case 3:
				 System.out.println("Transaction Details");
				 System.out.println("-------------------");
				 gpay.showHistory();
				 break;
			 case 4:
				 System.out.println("Select the Account \n1.Icci\n2.Sbi");
				 int ch2=a.nextInt();
				 if(ch2==1)
				 {
					 gpay=icici;
					 System.out.println("Gpay is swiched to Icici Bank");
				 }
				 else if(ch2==2)
				 {
					 gpay=sbi;
					 System.out.println("Gpay is swiched to Sbi Bank");
				 }
				 break;
				  
			  case 5:
				 System.out.println("thank you using gpay!");
				 break;
		    
			default:
				System.out.println("Invalid options");
				}
	
			 
			 
		
		} while (ch!=5);
		

	
	}

}
