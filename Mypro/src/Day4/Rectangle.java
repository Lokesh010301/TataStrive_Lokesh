package Day4;

import java.awt.Color;

public class Rectangle extends Shape {
	
	private double length;
	private double breath;
	
	public Rectangle() {
		
	}
	
	public Rectangle( String color ,double length , double breath) {
		super(color);
		this.breath = breath;
		this.length = length;
		}

	@Override
	public double CalculateArea() {
		
		return length*breath;
	}
	
	

}
