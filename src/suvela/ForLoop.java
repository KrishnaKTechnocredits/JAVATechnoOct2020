package suvela;

public class ForLoop {

	void even(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.println("Even number is " + i);
			i++;
		}
	}

	void divisibleBy5(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i % 5 == 0)
				System.out.println("Number divisible by 5 is " + i);
		}

	}

	void divide(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i % 5 == 0 && i % 3 == 0)
				System.out.println("Number divisible by 5 and 3 is " + i);
		}
	}

	void division(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (i % 7 == 0)
				System.out.println(i + " is by Divisble by 7 ");
			else if (i % 13 == 0)
				System.out.println(i + " is by Divisble by 13 ");
		}
	}

	public static void main(String[] args) {
		ForLoop loop = new ForLoop();
		loop.even(10, 15);
		loop.divisibleBy5(10, 30);
		loop.divide(5, 18);
		loop.division(5, 40);
	}

}
