package vishakha.Asgnmt37;

/*
Print Fibonacci series for first 10 numbers.
output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/

public class FibonacciSeries {
	
	void displayFibonacci(int number) {
		int n=0, m=1, sum;
		System.out.print(n+" "+m);
		for(int index=2; index<number; index++) {
			sum=n+m;
			System.out.print(" "+sum);
			n=m;
			m=sum;
		}
	}

	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.displayFibonacci(10);
	}
}
