package rohan;

public class WhileExample {

	void evenNumbers(int startIndex, int endIndex) {
		System.out.println("Even numbers are:");
		while(startIndex <= endIndex) {
			if(startIndex%2 == 0)
				System.out.println(startIndex);
			startIndex++;
		}
	}
	
	void divisibleByFive(int startIndex, int endIndex) {
		System.out.println("Numbers divisible by 5 are:");
		while(startIndex <= endIndex) {
			if(startIndex%5 == 0)
				System.out.println(startIndex);
			startIndex++;
		}
	}
	
	void divisibleByFiveAndThree(int startIndex, int endIndex) {
		System.out.println("Numbers divisible by 5 and 3 are:");
		while(startIndex <= endIndex) {
			if(startIndex%5==0 && startIndex%3==0)
				System.out.println(startIndex);
			startIndex++;
		}
	}
	
	void divisibleBySevenOrThirteen(int startIndex, int endIndex) {
		System.out.println("Numbers divisible by 7 or 13 are:");
		while(startIndex <= endIndex) {
			if(startIndex%7==0)
				System.out.println(startIndex+" is divisible by 7");
			if(startIndex%13==0)
				System.out.println(startIndex+" is divisible by 13");
			startIndex++;
		}
	}
	
	public static void main(String[] a) {
		NumberPrinting numberPrinting = new NumberPrinting();
		numberPrinting.evenNumbers(10,20);
		numberPrinting.divisibleByFive(10, 20);
		numberPrinting.divisibleByFiveAndThree(10, 20);
		numberPrinting.divisibleBySevenOrThirteen(5, 40);
	} 
		
}
