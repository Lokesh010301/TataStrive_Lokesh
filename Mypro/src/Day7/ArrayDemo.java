package Day7;

public class ArrayDemo {

	public static void main(String[] args) {
		String [] signal={"Airtel","Bsnl","Vodafone"};
		int [][] range= {{100,949,848,765},{111,123,232,333},{789,388,786,595}};
		
			for(int i=0;i<signal.length;i++)
			{     
				int totalRange=0;
				System.out.println(signal[i]);
				for(int j=0;j<range[i].length;j++)
				{
					totalRange+=range[i][j];
					System.out.println(range[i][j]);
				
				}
				System.out.println("TOTAL RANGE:"+totalRange);
				
			}
	
	}

}
