package shrutiC;

class Calculator {

	void printEvenNos(int startIndex, int endIndex) {

		System.out.println("\nEven numbers between " + startIndex + " and " + endIndex + " are :-");
		for (int i = startIndex; i <= endIndex; i++) {
			System.out.println(i);
			i++;
		}

	}

	void printNumDivisibleBy5(int startIndex, int endIndex) {

		System.out.println("\nDivisible by 5, numbers between " + startIndex + " and " + endIndex + " are :-");
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 5 == 0)
				System.out.println(i);
		}
	}

	void printNumDivisibleBy5And3(int startIndex, int endIndex) {

		System.out.println("\nDivisible by 5 & 3, numbers between " + startIndex + " and " + endIndex + " are :-");
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 5 == 0 && i % 3 == 0)
				System.out.println(i);
		}
	}

	void printNumDivisibleBy7Or13(int startIndex, int endIndex) {

		System.out.println("\nDisplay numbers divisible by 7 & 13 between " + startIndex + "and " + endIndex);
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 7 == 0)
				System.out.println(i + " is divisible by 7");
			else if (i % 13 == 0)
				System.out.println(i + " is divisible by 13");
		}
	}

	public static void main(String[] args) {

		Calculator calculate = new Calculator();
		calculate.printEvenNos(10, 15);
		calculate.printNumDivisibleBy5(10, 30);
		calculate.printNumDivisibleBy5And3(5, 18);
		calculate.printNumDivisibleBy7Or13(5, 40);
	}

}
