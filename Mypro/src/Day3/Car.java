package Day3;

public class Car {

	private String make;
	private String model;
	private int  year;
	public Car(String make, String model, int year) 
	{
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public void displayDetails()
	{
;
		System.out.println(make); 
		System.out.println(model);
		System.out.println(year); 
	}
	@Override
	public String toString() {
		return "Make:"+make+"\nModel:"+model+"\nYEAR:"+year;
	}
	public static void main(String[] args) {
		Car a=new Car("BMW","ELECTRICAL",2024);
		System.out.println(a);
		a.displayDetails();
		
	}
	
}

