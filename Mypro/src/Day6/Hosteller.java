package Day6;

public class Hosteller extends Student
{
	
	private int roomNumber;
	private char blockName;
	private String roomType;
	
		
	public Hosteller(int studentId, String studentName, String department, String gender, String category,
			double collegeFee,int roomNumber,char blockName,String roomType) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.roomNumber=roomNumber;
		this.blockName=blockName;
		this.roomType=roomType;
	}

	public int getRoomNumber() 
	{
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) 
	{
		this.roomNumber = roomNumber;
	}

	public char getBlockName() 
	{
		return blockName;
	}

	public void setBlockName(char blockName) 
	{
		this.blockName = blockName;
	}

	public String getRoomType() {
		return roomType;
	}
	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
  /*  private	int collegeFee;	
	private int hostelFee;
	private int roomTypeAmount;*/
	
	@Override
	public double CalculateTotalFee() {
		
		 double totalamt=getCollegeFee();
				if(blockName=='A')
				{
					totalamt=+60000;
					if(roomType=="Ac")
					{
						totalamt+=8000;
					}
				
				
					else if(blockName=='B')
					{
						totalamt=+50000;
						if(roomType=="Ac")
						{
							totalamt+=5000;
						}
						
					
					}
				  else if (blockName=='c')
					{
					      totalamt=+40000;
							if(roomType=="AC")
							{
								totalamt+=2500;
							}
							
						}
					
					
				}
		
	   
		return totalamt;
		
	}

}
