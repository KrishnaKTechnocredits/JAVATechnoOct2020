package suresh;
//Verify number is in Fibonacci series or not.
public class FibonacciSeries {

	void numberFibonacci(int n) {
		int firstNumber = 0, secondNumber = 1, fibonacciNumber = 0;

		while (fibonacciNumber < n) {
			fibonacciNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = fibonacciNumber;
		}

		if (n == fibonacciNumber) {
			System.out.println(n+"-->Number belongs to Fibonacci series");
		} else {
			System.out.println(n+"-->Number does not belong to Fibonacci series");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries fibonacciseries = new FibonacciSeries();
		fibonacciseries.numberFibonacci(8);
		fibonacciseries.numberFibonacci(12);
	}

}
