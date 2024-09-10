package Day4;

public class Shape {
	
	private String color;
	private double area;
	
	
	public Shape(){
		
	}
	
	public Shape(String color ) {
				this.color = color;
	}
	
	public double CalculateArea() {
		return 0;
	}
	
	public void showDetails() {
		System.out.println("Shape details: \n --------- \n Color: " + color);
		System.out.println("Area: " + CalculateArea());
	}


	

}
