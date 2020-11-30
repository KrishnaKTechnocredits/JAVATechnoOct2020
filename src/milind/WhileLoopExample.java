package milind;

public class WhileLoopExample {
	
	void printEvenNumber(int startPointOfRange, int endPointOfRange) {
		System.out.println("Even numbers are: ");
		while(startPointOfRange <= endPointOfRange) {
			if(startPointOfRange % 2 == 0) {
				System.out.println(startPointOfRange);
			}
			startPointOfRange++;
		}
	}
	
	void printNumberDivisibleByFive(int startPointOfRange, int endPointOfRange) {
		System.out.println("Divisible by 5, numbers are: ");
		while(startPointOfRange <= endPointOfRange) {
			if(startPointOfRange % 5 == 0) {
				System.out.println(startPointOfRange);
			}
			startPointOfRange++;
		}
	}
	
	void printNumberDivisibleByFiveAndThree(int startPointOfRange, int endPointOfRange) {
		System.out.println("Divisible by 5 & 3, numbers are:");
		while(startPointOfRange <= endPointOfRange) {
			if(startPointOfRange % 3 == 0 && startPointOfRange % 5 == 0) {
				System.out.println(startPointOfRange);
			}
			startPointOfRange++;
		}
	}
	
	void printNumberDivisibleBySevenOrThirteen(int startPointOfRange, int endPointOfRange) {
		System.out.println("Divisible by 7 or 13, numbers are: ");
		while(startPointOfRange <= endPointOfRange) {
			if(startPointOfRange % 7 == 0) {
				System.out.println(startPointOfRange + " is divisible by 7");
			}else if (startPointOfRange % 13 == 0) {
				System.out.println(startPointOfRange + " is divisible ny 13");
			}
			startPointOfRange++;
		}
	}
	
	public static void main(String[] args) {
		WhileLoopExample whileLoopExample = new WhileLoopExample();
		whileLoopExample.printEvenNumber(10,15);
		whileLoopExample.printNumberDivisibleByFive(10, 30);
		whileLoopExample.printNumberDivisibleByFiveAndThree(5, 18);
		whileLoopExample.printNumberDivisibleBySevenOrThirteen(5, 40);
	}
}
