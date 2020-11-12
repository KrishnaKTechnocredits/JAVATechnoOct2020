package priya;

public class Calculator {

	int num1 = 15;
	int num2 = 3;
	int ans;

	void add(int num1, int num2) {
		ans = num1 + num2;
		System.out.println("Addition is : " + ans);
	}

	void sub(int num1, int num2) {
		ans = num1 - num2;
		System.out.println("Subtraction is : " + ans);
	}

	void div(int num1, int num2) {
		ans = num1 / num2;
		System.out.println("Division is : " + ans);
	}

	void multi(int num1, int num2) {
		ans = num1 * num2;
		System.out.println("Multiplication is : " + ans);
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(15, 3);
		calculator.sub(15, 3);
		calculator.div(15, 3);
		calculator.multi(15, 3);
	}

}
