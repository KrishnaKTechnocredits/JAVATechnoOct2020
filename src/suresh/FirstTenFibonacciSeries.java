package suresh;
/*Assignment - 37 : 10th Dec'2020 
Print Fibonacci series for first 10 numbers.

output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34*/
public class FirstTenFibonacciSeries {

	void fibonacciseries() {

		int previousNumber = 0;
		int nextNumber = 1;

		System.out.print("Fibonacci Series of numbers:");

		for (int i = 1; i <= 10; ++i) {
			System.out.print(previousNumber + " ");

			int sum = previousNumber + nextNumber;
			previousNumber = nextNumber;
			nextNumber = sum;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstTenFibonacciSeries fibonnaciseriescheck = new FirstTenFibonacciSeries();
		fibonnaciseriescheck.fibonacciseries();

	}

}
