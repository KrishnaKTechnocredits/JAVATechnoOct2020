package milind;

public class ForLoopExample {
	
	void evenNumberformRange(int startPointOfRange, int endPointOfRange) {
		System.out.println("Even numbers are: ");
		for(int i = startPointOfRange; i <= endPointOfRange; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
	
	void numberDevisibleByFive(int startPointOfRange, int endPointOfRange) {
		System.out.println("Divisible By 5, numbers are: ");
		for(int i = startPointOfRange; i <= endPointOfRange; i++) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
	
	void numberDivisibleByFiveAndThree(int startPointOfRange, int endPointOfRange) {
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for(int i = startPointOfRange;i <= endPointOfRange; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
	
	void numberDivisibleBySevenOrThirteen(int startPointOfRange, int endPointOfRange) {
		System.out.println("Divisible by 7 or 13, numbers are: ");
		for(int i = startPointOfRange; i <= endPointOfRange; i++) {
			if(i % 7 == 0) {
				System.out.println(i + " is divisible by 7");
			} else if(i % 13 == 0) {
				System.out.println(i + " is divisible by 13");
			}
		}
	}
	
	public static void main(String[] args) {
		ForLoopExample forLoopExample = new ForLoopExample();
		forLoopExample.evenNumberformRange(10, 15);
		forLoopExample.numberDevisibleByFive(10, 30);
		forLoopExample.numberDivisibleByFiveAndThree(5,30);
		forLoopExample.numberDivisibleBySevenOrThirteen(5, 40);
	}

}
