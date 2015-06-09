package pl.com.iwach.tournament;

public class League {

	int teamNumber;
	int[] Teams1;	
	int[] Teams2;
	boolean isEven;
	
	
public League(int teamNumbers) {
	
	this.isEven = (teamNumbers%2==0) ? true : false;
	this.teamNumber = (teamNumbers%2==0) ? teamNumbers : teamNumbers +1;
	
	Teams1 = new int[teamNumber/2];
	Teams2 = new int[teamNumber/2];
//	Teams1 = new int[(int)Math.ceil((float) teamNumber/2)];		
//	Teams2 = new int[(int)Math.ceil((float) teamNumber/2)];	
	
	for(int i=0;i<=Teams1.length-1;i++)
	{
		Teams1[i]=i+1;
		Teams2[i]=teamNumber-i;
	}
}

	
	void printTable(int[] Table)
	{
		for(int i=0;i<Table.length;i++)
		{
			System.out.print(Table[i]+" ");
		}
	}
	
	void createSchedule(int[] Table1, int[] Table2)
		{
				int temp1 = Table1[Table1.length-1];
				int temp2 = Table2[0];
				
				for(int j=Table1.length-1;j>0;j--)
					{
						Table1[j]=Table1[j-1];
					}
				Table1[1]=temp2;
				
				for(int k=0;k<Table2.length-1;k++)
					{
						Table2[k]=Table2[k+1];
					}
				Table2[Table2.length-1]=temp1;
		}
		
	
	void generateSchedule()
	{
		
		System.out.println("Runda 1");
		printTable(Teams1);
		System.out.println();
		printTable(Teams2);
		
		for(int i=2;i<teamNumber;i++)
		{
		System.out.println("\nRunda "+i);
		createSchedule(Teams1, Teams2);
		printTable(Teams1);
		System.out.println();
		printTable(Teams2);
		}
		
	}
	
	int matchesToPlay()
	{
		if (isEven) {return (teamNumber-1)*teamNumber/2;}
		else return (teamNumber-2)*(teamNumber-1)/2;
	}

}
