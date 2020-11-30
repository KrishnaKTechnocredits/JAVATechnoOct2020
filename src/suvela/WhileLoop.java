package suvela;

public class WhileLoop {
	void even(int num, int num2) {
		int index = num;
		while (index <= num2) {
			if (index % 2 == 0)
				System.out.println("Even number is " + index);
			index++;
		}

	}

	void divisibleBy5(int num, int num2) {
		int index = num;
		while (index <= num2) {
			if (index % 5 == 0)
				System.out.println("Number divisible by 5 is " + index);
			index++;
		}
	}

	void divide(int num, int num2) {
		int index = num;
		while (index <= num2) {
			if (index % 5 == 0 && index % 3 == 0)
				System.out.println("Number divisible by 5 and 3 is " + index);
			index++;
		}
	}

	void division(int num, int num2) {
		int index = num;
		while (index <= num2) {
			if (index % 7 == 0) {
				System.out.println(index + " is divisible by 7");
			} else if (index % 13 == 0)
				System.out.println(index + " is divisible by 13");
			index++;
		}
	}

	public static void main(String[] args) {
		WhileLoop loop = new WhileLoop();
		loop.even(10, 15);
		loop.divisibleBy5(10, 30);
		loop.divide(5, 18);
		loop.division(5, 40);
	}

}
