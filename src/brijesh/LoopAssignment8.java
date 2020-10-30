package brijesh;

public class LoopAssignment8 {

	void displayEvenNumber(int start, int end) {
		System.out.println("Even numbers are:");
		int index= start;
		while(index<=end) {
			if(index%2==0)
				System.out.println(index);
			index++;
		}
	}

	void displayNumberDivBy5(int start, int end) {
		System.out.println("Divisible by 5, numbers are:");
		int index= start;
		while(index<=end) {
			if(index%5==0)
				System.out.println(index);
			index++;
		}
	}

	void displayNumberDivBy5And3(int start, int end) {
		System.out.println("Divisible by 5 & 3, numbers are:");
		int index= start;
		while(index<=end) {
			if(index%5==0 && index%3==0)
				System.out.println(index);
			index++;
		}
	}

	void displayNumberDivBy7Or13(int start, int end) {
		System.out.println("Divisible by 7 or 13, numbers are:");
		int index= start;
		while(index<=end) {
			if(index%7==0)
				System.out.println(index +" is divisible by 7");
			else if(index%13==0)
				System.out.println(index +" is divisible by 13");
			index++;
		}
	}

	public static void main(String[] args) {
		LoopAssignment8 loopAssignment8 = new LoopAssignment8();
		loopAssignment8.displayEvenNumber(10, 15);
		loopAssignment8.displayNumberDivBy5(10, 30);
		loopAssignment8.displayNumberDivBy5And3(5, 18);
		loopAssignment8.displayNumberDivBy7Or13(5, 40);

	}

}
