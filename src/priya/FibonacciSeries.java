//Assignment - 37 : 10th Dec'2020 
//Print Fibonacci series for first 10 numbers.
//output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

package priya;

public class FibonacciSeries {

	void findFibonacciSeries(int input) {
		int num = 0;
		int num1 = 1;
		int sum = 0;
		String temp = num + " " + num1;

		for (int i = 2; i < input; i++) {
			sum = num + num1;
			num = num1;
			num1 = sum;
			temp = temp + " " + sum;
		}
		System.out.println("Fibonacci series upto " + input);
		System.out.println(temp);
	}

	public static void main(String[] args) {

		FibonacciSeries fibonacciseries = new FibonacciSeries();
		fibonacciseries.findFibonacciSeries(10);
	}

}
