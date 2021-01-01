package vishakha.Asgnmt38;

/*
Verify number is in Fibonacci series or not. 
*/

public class NoIsInFibonacciSeries {

	void isNumberFibonacci(int num) {
		int n = 0, m = 1, sum = 0;
		if (num == n || num == m)
		while (sum < num) {
			sum = n + m;
			n = m;
			m = sum;
		}
		if (num == sum)
			System.out.println(num + " is fibonacci number");
		else
			System.out.println(num + " is not fibonacci number");
	}

	public static void main(String[] args) {
		NoIsInFibonacciSeries numberIsFibonacci = new NoIsInFibonacciSeries();
		numberIsFibonacci.isNumberFibonacci(8);
		numberIsFibonacci.isNumberFibonacci(4);
	}
}
