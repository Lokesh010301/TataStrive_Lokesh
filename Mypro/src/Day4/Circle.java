package Day4;

public class Circle  extends Shape{
	private double radius;
	
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(String color,double radius) {
		super(color);
		this.radius= radius;
	}
	
	@Override
	public double  CalculateArea() {
		
		return Math.PI*radius*radius;
	}
		
	
}
