package Day3;

public class Rectangle {
	private double length;	
	private static final double width;
	static {
		width=1.0;
	}
	public Rectangle(double length) {
		this.length = length;
	 }
	
	 public double MethodArea()
	 {
		 double area =(length*width);
		 return area; 
	 }

	@Override
	public String toString() {
		return "Length:"+length +"\nWidth "+width +"\nArea"+MethodArea();
	}
public static void main(String[] args) {
	Rectangle react= new Rectangle(0);
	System.out.println(react);
}
	
	
	
	
	
}
