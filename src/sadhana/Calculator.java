package sadhana;

class Calculator {

	void addition(int num1, int num2) {
		int ans = num1 + num2;
		System.out.println("Addition is " + ans);
	}

	void substraction(int num1, int num2) {
		int ans = num1 - num2;
		System.out.println("Substraction is " + ans);
	}

	void division(int num1, int num2) {
		int ans = num1 / num2;
		System.out.println("Division is " + ans);
	}

	void multiply(int num1, int num2) {
		int ans = num1 * num2;
		System.out.println("Multiplication is " + ans);
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.addition(10, 20);
		calculator.substraction(50, 30);
		calculator.division(60, 3);
		calculator.multiply(5, 4);

	}
}
