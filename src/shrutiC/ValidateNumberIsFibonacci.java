package shrutiC;

public class ValidateNumberIsFibonacci {

	void isNumInFibonacciSeries(int number) {
		int num = 0, num1 = 1, sum = 0;
		while (sum <= number) {
			sum = num + num1;
			num = num1;
			num1 = sum;
		}

		if (number == num || number == num1 || number == sum)
			System.out.println(number + " is in fibonacci series");
		else
			System.out.println(number + " is not in fibonacci series");
	}

	public static void main(String[] args) {
		ValidateNumberIsFibonacci object = new ValidateNumberIsFibonacci();
		object.isNumInFibonacciSeries(34);
		object.isNumInFibonacciSeries(100);
	}

}
