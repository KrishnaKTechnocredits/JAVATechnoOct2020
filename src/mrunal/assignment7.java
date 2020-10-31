package mrunal;

public class assignment7 {
	void displayEven(int start, int end )
	{
		for(int i= start; i<=end;i++ )
		{
			if(i%2==0)
			 System.out.println(i +" is even number");
		}
	}

	void displayDivisiblebyFive(int start, int end )
	{
		for(int i= start; i<=end;i++ )
		{
			if(i%5==0)
			 System.out.println(i +" is divisible by 5");
		}
	}
	
	void displayDivisiblebyFiveAndThree(int start, int end )
	{
		for(int i= start; i<=end;i++)
		{
			if(i%5==0 && i%3==0)
			 System.out.println(i +" is divisible by 5 and 3");
		}	
		
	}
	
	void displayDivisiblebySevenAndThirteen(int start, int end )
	{
		for(int i= start; i<=end;i++)

		{
			if((i%7==0) || (i%13==0))
			 System.out.println(i +" is divisible by "  );
		}	
	}
	
	public static void main(String[] args) {
		assignment7 a = new assignment7();
		
		 System.out.println(" Even number from 10 to 15-- ");
		 a.displayEven(10,15);
		 
		 System.out.println("\n" + " Divisible by 5 from 10 to 30-- ");
		 a.displayDivisiblebyFive(10,30);
		 
		 System.out.println("\n" + "---Divisible by 5 and 3 from 5 to 18-- ");
		 a.displayDivisiblebyFiveAndThree(5,18);
		 
		 System.out.println("\n" + "---Divisible by 7 and 13 from 5 to 40-- ");
		 a.displayDivisiblebySevenAndThirteen(5,40);
		 
	}

}
