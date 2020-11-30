package priyanka;

public class WhileLoopExample {

	void evenNumber(int start, int end) {

		System.out.println("**************** Even numbers are ***********");
		int index = start;
		while (index <= end) {
			if (index % 2 == 0)
				System.out.println(index);
			index++;
		}
	}

	void divisibleBy5(int start, int end) {

		System.out.println("****************  Numbers Divisible by 5 are ***********");
		int index = start;
		while (index <= end) {
			if (index % 5 == 0)
				System.out.println(index);
			index++;
		}
	}

	void divisibleBy5And3(int start, int end) {

		System.out.println("****************  Numbers Divisible by 5  and 3 are ***********");

		int index = start;
		while (index <= end) {
			if (index % 5 == 0 && index % 3 == 0)
				System.out.println(index);
			index++;
		}
	}

	void divisibleBy7Or13(int start, int end) {

		System.out.println("****************  Numbers Divisible by 5  and 3 are ***********");

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

		WhileLoopExample whileLoopExample = new WhileLoopExample();

		whileLoopExample.evenNumber(10, 15);
		whileLoopExample.divisibleBy5(10, 30);
		whileLoopExample.divisibleBy5And3(5, 18);
		whileLoopExample.divisibleBy7Or13(5, 40);
	}

}
