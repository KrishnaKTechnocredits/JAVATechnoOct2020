package sadhana;

class LoopAssignment8 {

	void printEvenNumber(int start, int end) {

		int index = start;
		while (index <= end) {
			if (index % 2 == 0)
				System.out.println(+index);
			index++;
		}
	}

	void divisibleNoBy5(int start, int end) {

		int index = start;
		while (index <= end) {
			if (index % 5 == 0)
				System.out.println(+index);
			index++;
		}
	}

	void divisibleNoBy5And3(int start, int end) {

		int index = start;
		while (index <= end) {
			if (index % 5 == 0 && index % 3 == 0)
				System.out.println(+index);
			index++;
		}
	}

	void divisibleNoBy7Or13(int start, int end) {

		int index = start;
		while (index <= end) {
			if (index % 7 == 0)
				System.out.println(index + " is divisible by 7");
			else if (index % 13 == 0)
				System.out.println(index + " is divisible by 13");
			index++;
		}
	}

	public static void main(String[] args) {
		LoopAssignment8 loopAssignment8 = new LoopAssignment8();
		System.out.println("Even numbers within given range:");
		loopAssignment8.printEvenNumber(10, 15);
		System.out.println("Numbers divisible by 5 within given range:");
		loopAssignment8.divisibleNoBy5(10, 30);
		System.out.println("Numbers divisible by 5 and 3 within given range:");
		loopAssignment8.divisibleNoBy5And3(5, 18);
		System.out.println("Numbers divisible by 7 or 13 within given range:");
		loopAssignment8.divisibleNoBy7Or13(5, 40);
	}
}
