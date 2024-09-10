package day08;

import java.util.Arrays;

public class HappyMart {
	public static void main(String[] args) {
		Product[] products = {
				new Product(200,"battery",400),
				new Product(220,"charger",500.0),
				new Product(201,"mouse",470),
				new Product(233,"cpu",40000)
		};
		Arrays.sort(Product,new sortBypri);
		System.out.println("Original");
		for(int i =0;i<products.length;i++) {
		System.out.println(products[i]);
		}
		Arrays.sort();
			
	}

}
