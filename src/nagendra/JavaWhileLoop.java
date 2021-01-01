package nagendra;

class JavaWhileLoop {

	void printEvenNumbers(int startIndex, int endIndex) {
		System.out.println("<<<----The Even numbers are:----->> ");

		while (startIndex <= endIndex) {
			if (startIndex % 2 == 0) {
				System.out.println("The Even numbers are: " + startIndex);
			}
			startIndex++;

		}
	}

	void numberDivisibleBy5(int startIndex, int endIndex) {
		System.out.println("<<<----- All the numbers which is divisible by 5 are:---> ");

		while (startIndex <= endIndex) {
			if (startIndex % 5 == 0) {
				System.out.println("Divisible by 5, numbers are: " + startIndex);
			}
			startIndex++;

		}

	}

	void numberDivisibleBy5and3(int startIndex, int endIndex) {
		System.out.println("<<<----- All the numbers which is divisible by  5 and  3 are:---> ");

		while (startIndex <= endIndex) {
			if (startIndex % 5 == 0 && startIndex % 3 == 0) {
				System.out.println(" Divisible by 5 & 3, numbers are: " + startIndex);

			}
			startIndex++;
		}
	}

	void numberDivisibleBy7or13(int startIndex, int endIndex) {
		System.out.println("<<<----- All the numbers which is divisible by either 7 or  13 are:---> ");

		while (startIndex <= endIndex) {
			if (startIndex % 7 == 0) {
				System.out.println(+startIndex + " is divisible by 7");
			} else if (startIndex % 13 == 0) {
				System.out.println(+startIndex + " is divisible by 13");

			}
			startIndex++;

		}
	}

	public static void main(String[] args) {
		JavaWhileLoop loop = new JavaWhileLoop();
		loop.printEvenNumbers(10, 15);
		loop.numberDivisibleBy5(10, 30);
		loop.numberDivisibleBy5and3(5, 18);
		loop.numberDivisibleBy7or13(5, 40);

	}
}