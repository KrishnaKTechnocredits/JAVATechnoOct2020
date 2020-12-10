package nagendra.logicalPrograms;

/*
Assignment - 37 : 10th Dec'2020 
Print Fibonacci series for first 10 numbers.
output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/
public class FibonacciSeries {

	void getFibonacciSeries(int number) {
		int firstNumber = 0;
		int secondNumber = 0;
		int fibonacciNumber = 0;
		for (int i = 0; i < number; i++) {
			if (i < 2) {
				firstNumber = i;
				secondNumber = fibonacciNumber;
				fibonacciNumber = firstNumber + secondNumber;
				System.out.println(fibonacciNumber);
			} else {
				firstNumber = secondNumber;
				secondNumber = fibonacciNumber;
				fibonacciNumber = firstNumber + secondNumber;
				System.out.println(fibonacciNumber);
			}
		}
	}

	public static void main(String[] args) {
		FibonacciSeries series = new FibonacciSeries();
		series.getFibonacciSeries(10);
	}
}
