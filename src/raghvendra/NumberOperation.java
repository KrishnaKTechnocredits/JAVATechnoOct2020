package raghvendra;

public class NumberOperation {
	
	void evenNumber(int start,int end) {
		
		System.out.println("Even numbers in range "+start+" and "+end+" are:");
		
		for (int index=start;index<=end;index++) {
			
			if (index%2==0)
				System.out.println(+index);
		}
	}
	
	void divisibleByFive(int startNumber,int endNumber) {
		
		System.out.println("Numbers divisible by 5 in range "+startNumber+" and "+endNumber+" are:");
		
		for (int index=startNumber;index<=endNumber;index++) {
			
			if (index%5==0)
				System.out.println(+index);
		}
	}
	
	void divisibleByFiveAndThree(int startNumber,int endNumber) {
		
		System.out.println("Numbers divisible by 5 & 3 in range "+startNumber+" and "+endNumber+" are:");

		for (int index=startNumber;index<=endNumber;index++) {
			
			if (index%5==0 && index%3==0)
				System.out.println(+index);
		}
	}
	
	void divisibleBySevenOrThirteen(int startNumber,int endNumber) {
		
		System.out.println("Numbers divisble by 7 or 13: ");
		for (int index=startNumber;index<=endNumber;index++) {
			
			if (index%7==0)
				System.out.println(index+" is divisible by 7");
			else if (index%13==0)
				System.out.println(index+" is divisible by 13");
			}
	}

	public static void main(String[] args) {
		
		NumberOperation numberoperation=new NumberOperation();
		numberoperation.evenNumber(10, 15);
		numberoperation.divisibleByFive(10, 30);
		numberoperation.divisibleByFiveAndThree(5,18);
		numberoperation.divisibleBySevenOrThirteen(5,40);
	}

}
