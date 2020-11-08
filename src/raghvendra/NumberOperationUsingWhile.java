package raghvendra;

public class NumberOperationUsingWhile {
	
	void evenNumber(int start,int end) {
		int index=start;
		System.out.println("Even numbers in range "+start+" and "+end+" are:");
		while (index<=end) {
			if (index%2==0)
				System.out.println(+index);
			index++;
		}
	}
	
	void divisibleByFive(int startNumber,int endNumber) {
		int index=startNumber;
		System.out.println("Numbers divisible by 5 in range "+startNumber+" and "+endNumber+" are:");
		while (index<=endNumber) {
			
			if (index%5==0)
				System.out.println(+index);
			index++;
		}
	}
	
	void divisibleByFiveAndThree(int startNumber,int endNumber) {
		int index=startNumber;
		System.out.println("Numbers divisible by 5 & 3 in range "+startNumber+" and "+endNumber+" are:");
		while (index<=endNumber) {
			if (index%5==0 && index%3==0)
				System.out.println(+index);
			index++;
		}
	}
	
	void divisibleBySevenOrThirteen(int startNumber,int endNumber) {
		int index=startNumber;
		System.out.println("Numbers divisble by 7 or 13: ");
		while (index<=endNumber) {
			
			if (index%7==0)
				System.out.println(index+" is divisible by 7");
			else if (index%13==0)
				System.out.println(index+" is divisible by 13");
			index++;
			}
	}

	public static void main(String[] args) {
		NumberOperationUsingWhile numberoperationusingWhile=new NumberOperationUsingWhile();
		numberoperationusingWhile.evenNumber(10, 15);
		numberoperationusingWhile.divisibleByFive(10, 30);
		numberoperationusingWhile.divisibleByFiveAndThree(5,18);
		numberoperationusingWhile.divisibleBySevenOrThirteen(5,40);
	}



}
