package shrutiC;

class MathematicalOperation {

	void printEvenNos(int startIndex, int endIndex) {

		System.out.println("\nEven numbers between " + startIndex + " and " + endIndex + " are :-");
		int i = startIndex;
		while (i <= endIndex) {
			System.out.println(i);
			i++;
			i++;
		}
	}

	void printNumDivisibleBy5(int startIndex, int endIndex) {

		System.out.println("\nDivisible by 5, numbers between " + startIndex + " and " + endIndex + " are :-");

		int i = startIndex;
		while (i <= endIndex) {
			if (i % 5 == 0)
				System.out.println(i);
			i++;
		}
	}

	void printNumDivisibleBy5And3(int startIndex, int endIndex) {

		System.out.println("\nDivisible by 5 & 3, numbers between " + startIndex + " and " + endIndex + " are :-");

		int i = startIndex;
		while (i <= endIndex) {
			if (i % 5 == 0 && i % 3 == 0)
				System.out.println(i);
			i++;
		}
	}

	void printNumDivisibleBy7Or13(int startIndex, int endIndex) {

		System.out.println("\nDisplay numbers divisible by 7 & 13 between " + startIndex + " and " + endIndex);

		int i = startIndex;
		while (i <= endIndex) {
			if (i % 7 == 0)
				System.out.println(i + " is divisible by 7");
			else if (i % 13 == 0)
				System.out.println(i + " is divisible by 13");
			i++;
		}
	}

	public static void main(String[] args) {

		MathematicalOperation calculate = new MathematicalOperation();
		calculate.printEvenNos(10, 15);
		calculate.printNumDivisibleBy5(10, 30);
		calculate.printNumDivisibleBy5And3(5, 18);
		calculate.printNumDivisibleBy7Or13(5, 40);
	}

}
