package prog;

public class Product {
		
	
     private String name;
	 private double price;
	 private int quantity;
	
	public void setName(String name) {
		this.name=name;
		
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public String getname()
	{
		return name;
	}
	public double getprice() {
		return price;
	}
	public int quantity() {
		return quantity;
	}

	public void productDetails()
	{
		System.out.println("Product Name:"+name);
		System.out.println("Product Price:"+price);
		System.out.println("Product Quantity:"+quantity);
		
		
	}
	}
	
	
	
	

   