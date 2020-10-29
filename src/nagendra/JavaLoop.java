package nagendra;

public class JavaLoop {

	void printEvenNumber(int startIndex, int endIndex) {

		System.out.println("<<<----The Even numbers are:----->> ");

		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 2 == 0) {
				System.out.println("The Even numbers are: " + i);
			}
		}

	}

	void numberDivisibleBy5(int startIndex, int endIndex) {
		System.out.println("<<<----- All the numbers which is divisible by 5 are:---> ");

		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 5 == 0) {
				System.out.println("Divisible by 5, numbers are: " + i);
			}
		}

	}

	void numberDivisibleBy5and3(int startIndex, int endIndex) {
		System.out.println("<<<----- All the numbers which is divisible by 5 & 3 are:---> ");

		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Numbers which is Divisible by 5 & 3, numbers are::  " + i);
			}
		}

	}

	void numberDivisibleBy7or13(int startIndex, int endIndex) {
		System.out.println("<<<----- All the numbers which is divisible by either 7 or  13 are:---> ");

		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 7 == 0) {
				System.out.println(+i + " is divisible by 7");
			} else if (i % 13 == 0) {
				System.out.println(+i + " is divisible by 13");

			}

		}
	}

	public static void main(String[] args) {
		JavaLoop loop = new JavaLoop();
		loop.printEvenNumber(10, 15);
		loop.numberDivisibleBy5(10, 30);
		loop.numberDivisibleBy5and3(5, 18);
		loop.numberDivisibleBy7or13(5, 40);

	}

}
