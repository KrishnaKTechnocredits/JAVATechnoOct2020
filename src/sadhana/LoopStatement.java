package sadhana;

class LoopStatement {
	void printEvenNo(int start, int end) {
		for (int index = start; index <= end; index++) {

			if (index % 2 == 0)
				System.out.println(+index);
		}

	}

	void divisibleNoBy5(int start, int end) {
		for (int index = start; index <= end; index++) {

			if (index % 5 == 0)
				System.out.println(+index);
		}
	}

	void divisibleNoBy5And3(int start, int end) {
		for (int index = start; index <= end; index++) {

			if (index % 5 == 0 && index % 3 == 0)
				System.out.println(+index);
		}
	}

	void divisibleNoBy7Or13(int start, int end) {
		for (int index = start; index <= end; index++) {
			if (index % 7 == 0)
				System.out.println(index + " is divisible by 7");
			else if (index % 13 == 0)
				System.out.println(index + " is divisible by 13");
		}
	}

	public static void main(String[] args) {
		LoopStatement loopStatement = new LoopStatement();
		System.out.println("Even numbers within given range:");
		loopStatement.printEvenNo(10, 15);
		System.out.println("Numbers divisible by 5 within given range:");
		loopStatement.divisibleNoBy5(10, 30);
		System.out.println("Numbers divisible by 5 and 3 within given range:");
		loopStatement.divisibleNoBy5And3(5, 18);
		System.out.println("Numbers divisible by 7 or 13 within given range:");
		loopStatement.divisibleNoBy7Or13(5, 40);
	}
}
