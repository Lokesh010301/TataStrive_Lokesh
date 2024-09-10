package Day3;

import java.util.Scanner;

public class Person {
	private String name;
	private int age; 
	
	
	public Person(String name, int age)
	{
		
		this.name = name;
		this.age = age;
		
		if (age<0)
		{
			System.out.println("invalid this is negative value");
			this.age=0;
		}
		
		
	 }
	
		  public boolean isAdult()
		{
			return age>=18? true:false;
					
		}

		
		@Override
		public String toString() {
			return "Name:"+name+"\nAge:"+age+"\ncatagories:"+(isAdult()?"Adulthood":"Childhood");
		}
		
	
		public static void main(String[] args) 
			{
			Scanner b=new Scanner(System.in);
	    	  System.out.println("Name:");
	    	  String name=b.nextLine();
	    	  System.out.println("age:");
	    	  int age = b.nextInt();
			Person a=new Person(name,age);
			System.out.println(a);
			
			}
}
		
			
		
		
		
			
		
			
		
	
	

