package prog;

public class Employee
{
	private String name;
	private int id;
	private double salary;
	
	
	
	public Employee()
	{
		
	}



	public Employee(String name, int id, double salary)
	{
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public void displayDetails()
	{
		System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
	}
	

	
}


 