package assignments;

public class WhileLoopConcept {

	int startNumber;
	int endNumber;

	void displayEvenNumbers(int startNumber, int endNumber) {
		int number = startNumber;
		while (number <= endNumber) {
			if (number % 2 == 0)
				System.out.println(number + " is even number");
			number++;
		}
	}

	void divisibleByFive(int startNumber, int endNumber) {
		int number = startNumber;
		while (number <= endNumber) {
			if (number % 5 == 0)
				System.out.println(number + " is divisible by 5");
			number++;
		}
	}

	void divisibleByThreeAndFive(int startNumber, int endNumber) {
		int number = startNumber;
		while (number <= endNumber) {
			if (number % 5 == 0 && number % 3 == 0)
				System.out.println(number + " is divisible by 3 & 5");
			number++;
		}
	}

	void divisibleBySevenOrThirteen(int startNumber, int endNumber) {
		int number = startNumber;
		while (number <= endNumber) {
			if (number % 7 == 0)
				System.out.println(number + " is divisible by 7");
			else if (number % 13 == 0)
				System.out.println(number + " is divisible by 13");
			number++;
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
