package priyanka;

public class Calculator {

	int ans;

	void add(int x, int y) {

		ans = x + y;
		System.out.println("Addition is " + ans);

	}

	void sub(int x, int y) {

		ans = x - y;
		System.out.println("Subtraction is " + ans);
	}

	void division(int x, int y) {

		ans = x / y;
		System.out.println("Division is " + ans);

	}

	void multiply(int x, int y) {

		ans = x * y;
		System.out.println("Multiplication is " + ans);

	}

	public static void main(String[] arg) {

		Calculator calculator = new Calculator();
		calculator.add(12, 5);
		calculator.sub(30, 10);
		calculator.division(15, 2);
		calculator.multiply(3, 4);

	}

}
