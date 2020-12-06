package brijesh;

public class LoopAssignment7 {

	void displayEvenNumber(int start, int end) {
		System.out.println("Even numbers are:");
		for (int index = start; index <= end; index++) {
			if(index%2==0)
				System.out.println(index);
		}
	}

	void displayNumberDivBy5(int start, int end) {
		System.out.println("Divisible by 5, numbers are:");
		for (int index = start; index <= end; index++) {
			if(index%5==0)
				System.out.println(index);
		}
	}

	void displayNumberDivBy5And3(int start, int end) {
		System.out.println("Divisible by 5 & 3, numbers are:");
		for (int index = start; index <= end; index++) {
			if(index%5==0 && index%3==0)
				System.out.println(index);
		}
	}

	void displayNumberDivBy7Or13(int start, int end) {
		System.out.println("Divisible by 7 or 13, numbers are:");
		for (int index = start; index <= end; index++) {
			if(index%7==0)
				System.out.println(index +" is divisible by 7");
			else if(index%13==0)
				System.out.println(index +" is divisible by 13");
		}
	}

	public static void main(String[] args) {
		LoopAssignment7 loopAssignment7 = new LoopAssignment7();
		loopAssignment7.displayEvenNumber(10, 15);
		loopAssignment7.displayNumberDivBy5(10, 30);
		loopAssignment7.displayNumberDivBy5And3(5, 18);
		loopAssignment7.displayNumberDivBy7Or13(5, 40);

	}

}
