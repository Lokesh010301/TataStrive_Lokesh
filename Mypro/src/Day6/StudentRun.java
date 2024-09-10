package Day6;

import java.util.Scanner;

public class StudentRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id :");
		int studentId = sc.nextInt();
		System.out.println("Enter Student name :");
		String studentName = sc.next();
		System.out.println("Enter department name :");
		String department = sc.next();
		System.out.println("Enter gender :");
		String gender = sc.next();
		System.out.println("Enter category :");
		String category = sc.next();
		System.out.println("Enter College fee :");
		double collegeFee = sc.nextDouble();
		
		if (category.equals("Hosteller"))
		{
		System.out.println("Enter the room number :");
		int roomNumber = sc.nextInt();
		System.out.println("Enter the BlockName: ");
		char blockName = sc.next().charAt(0);
		System.out.println("Enter the room type :");
		String roomType = sc.next();
		
		Hosteller hosteller = new Hosteller(studentId, studentName, department, gender, category, collegeFee, roomNumber, blockName, roomType);
		System.out.println("Total College Fee is " + hosteller.CalculateTotalFee());
		} 
		else if(category.equals("Dayscholar"))
		{
		System.out.println("Enter Bus Number :");
		int busNumber = sc.nextInt();
		System.out.println("Enter the distance :");
		int distance = sc.nextInt();
		DayScholar dayscholar = new DayScholar(studentId, studentName, department, gender, category, collegeFee, busNumber, distance);
		System.out.println("Total College fee is " + dayscholar.CalculateTotalFee());
		}
	}
	}


