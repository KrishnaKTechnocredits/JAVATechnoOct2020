package shrutiC;

public class FibonacciSeries {

	void printFibonacciSeries(int lastNum) {
		int num = 0;
		int num1 = 1;
		int sum = 0;
		String fibonacciSeries = num + " " + num1;

		for (int i = 2; i < lastNum; i++) {
			sum = num + num1;
			num = num1;
			num1 = sum;
			fibonacciSeries = fibonacciSeries + " " + sum;
		}
		System.out.println("Fibonacci series upto " + lastNum);
		System.out.println(fibonacciSeries);
	}

	public static void main(String[] args) {

		FibonacciSeries object = new FibonacciSeries();
		object.printFibonacciSeries(10);
	}

}
