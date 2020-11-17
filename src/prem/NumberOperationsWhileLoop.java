package prem;


public class NumberOperationsWhileLoop {
	
	void evenNumber(int start,int end) {
		int index=start;
		System.out.println("Even numbers are:");
		
		while (index<=end) {
			if (index%2==0)
				System.out.println(+index);
			index++;
		}
	}
	
	void divisibleByFive(int startNumber,int endNumber) {
		int index=startNumber;
		System.out.println("Numbers divisible are:");
		
		while (index<=endNumber) {
			
			if (index%5==0)
				System.out.println(+index);
			index++;
		}
	}
	
	void divisibleByFiveAndThree(int startNumber,int endNumber) {
		int index=startNumber;
		System.out.println("Numbers divisible by 5 & 3 are:");
		
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
		NumberOperationsWhileLoop numberOperationsWhileLoop=new NumberOperationsWhileLoop();
		numberOperationsWhileLoop.evenNumber(10, 15);
		numberOperationsWhileLoop.divisibleByFive(10, 30);
		numberOperationsWhileLoop.divisibleByFiveAndThree(5,18);
		numberOperationsWhileLoop.divisibleBySevenOrThirteen(5,40);
	}



}
