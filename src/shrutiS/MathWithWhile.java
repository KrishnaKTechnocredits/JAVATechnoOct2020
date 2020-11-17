package shrutiS;

public class MathWithWhile {

	void evenNumbers(int startNumber, int endNumber) {
		System.out.println("Even Numbers are : ");
		int evenNumber = startNumber;
		while (evenNumber <= endNumber) {
			if (evenNumber % 2 == 0)
				System.out.println(evenNumber);
			evenNumber++;
		}
	}

	void divisibleBy5(int startNumber, int endNumber) {

		System.out.println("Numbers divisible by 5 are : ");
		int number = startNumber;
		while (number <= endNumber) {
			if (number % 5 == 0)
				System.out.println(number);
			number++;
		}
	}

	void divisibleBy5And3(int startNumber, int endNumber) {

		System.out.println("Numbers divisible by 5 & 3 are : ");
		int number = startNumber;
		while (number <= endNumber) {
			if (number % 5 == 0 && number % 3 == 0)
				System.out.println(number);
			number++;
		}
	}

	void divisibleBy7Or13(int startNumber, int endNumber) {

		System.out.println("Numbers divisible by 7 or 13 are : ");
		int number = startNumber;
		while ( number <= endNumber) {
			if (number % 7 == 0)
				System.out.println(number + " is divisible by 7");
			else if (number % 13 == 0)
				System.out.println(number + " is divisible by 13");
			number++;
		}
	}

	public static void main(String[] a) {
		MathNumberProblems mathproblem = new MathNumberProblems();
		mathproblem.evenNumbers(10, 15);
		mathproblem.divisibleBy5(10, 30);
		mathproblem.divisibleBy5And3(5, 18);
		mathproblem.divisibleBy7Or13(5, 40);
	}

}
