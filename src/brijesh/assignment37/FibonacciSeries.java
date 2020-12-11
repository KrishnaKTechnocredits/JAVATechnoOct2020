package brijesh.assignment37;

/*
Print Fibonacci series for first 10 numbers.

output : 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
*/

public class FibonacciSeries {
	
	void displayFibonacci(int number) {
		System.out.println("First "+number+" Fibonacci numbers:");
		int n=0, m=1, sum;
		System.out.print(n+" "+m);
		for(int index=2; index<number; index++) {
			sum=n+m;
			System.out.print(" "+sum);
			n=m;
			m=sum;
		}
		System.out.println("\n****************************************************************");
	}

	public static void main(String[] args) {
		FibonacciSeries fibonacciSeries = new FibonacciSeries();
		fibonacciSeries.displayFibonacci(10);
		fibonacciSeries.displayFibonacci(20);
	}
}
