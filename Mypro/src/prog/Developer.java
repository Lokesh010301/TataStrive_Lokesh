package prog;

class Developer extends Employee
{
	  String programmingLanguage;
	 public Developer(String name, int id, double salary,String programmingLanguage)
	    {
			super(name,id,salary);
			this.programmingLanguage= programmingLanguage;
		}
	 public void displayDetails()
	  {
		  super.displayDetails();
		  System.out.println("Programming: " + programmingLanguage);
	   } 
	 
	
}











