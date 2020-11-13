package shrutiS;

public class MathNumberProblems {

	void evenNumbers(int start, int end) {
		System.out.println("Even Numbers are : ");
		for (int index = start; index <= end; index++) {
			if (index % 2 == 0)
				System.out.println(index);
		}
	}

	void divisibleBy5(int start, int end) {

		System.out.println("Numbers divisible by 5 are : ");
		for (int index = start; index <= end; index++) {
			if (index % 5 == 0)
				System.out.println(index);
		}
	}

	void divisibleBy5And3(int start, int end) {

		System.out.println("Numbers divisible by 5 & 3 are : ");
		for (int index = start; index <= end; index++) {
			if (index % 5 == 0 && index % 3 == 0)
				System.out.println(index);
		}
	}

	void divisibleBy7Or13(int start, int end) {

		System.out.println("Numbers divisible by 7 or 13 are : ");
		for (int index = start; index <= end; index++) {
			if (index % 7 == 0)
				System.out.println(index + " is divisible by 7");
			else if (index % 13 == 0)
				System.out.println(index + " is divisible by 13");
		}
	}

	public static void main(String[] a) {
		MathNumberProblems mathproblem = new MathNumberProblems();
		mathproblem.evenNumbers(10, 15);
		mathproblem.divisibleBy5(10, 30);
		mathproblem.divisibleBy5And3(5, 18);
		mathproblem.divisibleBy7Or13(5, 40);
	}

}
