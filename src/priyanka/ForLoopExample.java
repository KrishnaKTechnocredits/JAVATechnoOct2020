package priyanka;

public class ForLoopExample {

	void evenNumber(int start, int end) {

		System.out.println(" **********The even numbers are *********");
		for (int index = start; index <= end; index++) {

			if (index % 2 == 0)
				System.out.println(index);
		}
	}

	void divisibleBy5(int start, int end) {

		System.out.println(" **********The numbers divisible by 5 are *********");
		for (int index = start; index <= end; index++) {

			if (index % 5 == 0)
				System.out.println(index);
		}
	}

	void divisibleBy5and3(int start, int end) {

		System.out.println(" **********The numbers divisible by 5 and 3 are *********");
		for (int index = start; index <= end; index++) {

			if (index % 5 == 0 && index % 3 == 0)
				System.out.println(index);
		}
	}

	void divisibleBy7or13(int start, int end) {

		System.out.println(" **********The numbers divisible by 7 or 13 are *********");
		for (int index = start; index <= end; index++) {

			if (index % 7 == 0)
				System.out.println(index + " is divisible by 7");
			else if (index % 13 == 0)
				System.out.println(index + " is divisble by 13");
		}
	}

	public static void main(String[] args) {

		ForLoopExample forLoopExample = new ForLoopExample();
		forLoopExample.evenNumber(10, 15);
		forLoopExample.divisibleBy5(10, 30);
		forLoopExample.divisibleBy5and3(5, 18);
		forLoopExample.divisibleBy7or13(5, 40);
	}

}
