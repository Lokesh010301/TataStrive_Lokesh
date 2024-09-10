package prog;

import java.util.Scanner;

public class BmiCalc {

	public static void main(String[] args) {
	Scanner a =new Scanner(System.in);
	System.out.println("Enter weight in kg");
	double weight=a.nextInt();
	System.out.println("Enter height in cm");
	double height=a.nextInt();
	 double bmi=weight/((height/100)*(height/100));
	 System.out.printf("Your BMI IS %2f",bmi);
	 if(bmi>=25)
	 {
		 System.out.println("YOU ARE OVERWEIGHT" );
		 System.out.println("TO REDUCES weight" + (bmi-25));
	 } 
	 else if(bmi>=18.5&&bmi<=25)
	 {
		 System.out.println("you are fit");
	 }
	 else {
		 System.out.println("You are under weight");
		 System.out.println("TO REDUCES weight" + (18.5-bmi));
	 }
	
	
	
	}

}
