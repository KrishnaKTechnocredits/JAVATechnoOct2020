/*Assignment - 37 
Print Fibonacci series for first 10 numbers.

output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34*/

package shrutiS.assignment37;

public class FibonacciSeries {
	void printFibonacciSeries(int input) {
		int n1 = 0, n2 = 1, n3 = 0;
		System.out.print(n1 + " " + n2 + " ");
		for (int index = 2; index < input; index++) {
			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries series = new FibonacciSeries();
		int count = 10;
		System.out.println("Fibonacci series for first 10 numbers");
		series.printFibonacciSeries(count);
	}

}
