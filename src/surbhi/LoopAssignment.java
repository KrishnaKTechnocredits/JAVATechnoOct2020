package surbhi;
public class LoopAssignment {

	void displayEvenNumber(int start, int end) {
		System.out.println("Even numbers");
		for (int index = start; index <= end; index++) {
			if (index % 2 == 0)
				System.out.println(index);
		}
	}

	void displayNumberDivBy5(int start, int end) {
		System.out.println("Divisible by 5, numbers are");
		for (int index = start; index <= end; index++) {
			if (index % 5 == 0)
				System.out.println(index);
		}
	}

	void displayNumberDivBy5And3(int start, int end) {
		System.out.println("Divisible by 5 & 3, numbers are");
		for (int index = start; index <= end; index++) {
			if (index % 5 == 0 && index % 3 == 0)
				System.out.println(index);
		}
	}

	void displayNumberDivBy7Or13(int start, int end) {
		System.out.println("Divisible by 7 or 13, numbers are");
		for (int index = start; index <= end; index++) {
			if (index % 7 == 0)
				System.out.println(index + " divisible by 7");
			else if (index % 13 == 0)
				System.out.println(index + " divisible by 13");
		}
	}

	public static void main(String[] args) {
		LoopAssignment loopAssignment = new LoopAssignment();
		loopAssignment.displayEvenNumber(5, 15);
		loopAssignment.displayNumberDivBy5(6, 30);
		loopAssignment.displayNumberDivBy5And3(6, 18);
		loopAssignment.displayNumberDivBy7Or13(8, 40);

	}

}
