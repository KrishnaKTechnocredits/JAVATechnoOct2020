package ankit;

public class LoopConcept {
	
	int startNumber;
	int endNumber;
	
	void displayEvenNumbers(int startNumber, int endNumber) {
		for(int number=startNumber; number<=endNumber; number++) {
			if(number%2==0)
				System.out.println(number + " is even number");
		}
	}
	
	void divisibleByFive(int startNumber, int endNumber) {
		for(int number=startNumber; number<=endNumber; number++) {
			if(number%5==0)
				System.out.println(number + " is divisible by 5");
		}
	}
	
	void divisibleByThreeAndFive(int startNumber, int endNumber) {
		for(int number=startNumber; number<=endNumber; number++) {
			if(number%5==0 && number%3==0)
				System.out.println(number + " is divisible by 3 & 5");
		}
	}
	
	void divisibleBySevenOrThirteen(int startNumber, int endNumber) {
		for(int number=startNumber; number<=endNumber; number++) {
			if(number%7==0 )
				System.out.println(number + " is divisible by 7");
			else if(number%13==0)
				System.out.println(number + " is divisible by 13");
		}
	}
	
	public static void main(String[] args) {
		LoopConcept loopConcept = new LoopConcept();
		loopConcept.displayEvenNumbers(10, 15);
		loopConcept.divisibleByFive(10, 30);
		loopConcept.divisibleByThreeAndFive(5, 18);
		loopConcept.divisibleBySevenOrThirteen(5, 40);
		
	}
}
