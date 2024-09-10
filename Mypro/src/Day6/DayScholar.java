package Day6;

public class DayScholar extends Student 
{
	private int busNumber;
	private float distance;
	
	public DayScholar(int studentId, String studentName, String department, String gender, String category,
			double collegeFee,int busName,float distance) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.busNumber=busName;
		this.distance=distance;
	
	}
	
	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	@Override
	public double CalculateTotalFee() {
		
		double amountFee=getCollegeFee();
		if(distance>=30 && distance<=40)
		{
			amountFee+=28000;
		}
		else if(distance>=20 && distance<=30)
		{
			amountFee+=20000;
		}
		else if(distance>=10 && distance<=20)
		{
			amountFee+=12000;
		}
		else if(distance<=10)
		{
			amountFee+=6000;
		}
			
		return amountFee;
		
	}
	
 	
}
