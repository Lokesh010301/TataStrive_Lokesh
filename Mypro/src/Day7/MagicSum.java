package Day7;

import java.util.Scanner;

public class MagicSum {
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the array size");
		int arry = a.nextInt();
		if (arry < 1 || arry > 5) {
			System.out.println("invalid array value");
			return;
		}
		int[] array=new int[arry];
		System.out.println("Enter the number:");
		
		for (int i = 1; i <= arry; i++) {
			int array1 = a.nextInt();
		}

	}
}
