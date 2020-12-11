package anjaliS;

public class FibonacciNumber {
	void displayFibonacciNum() {
		int maxnumber = 10;
		int firstnumber = 0;
		int secondnumber = 1;
		System.out.println("Fibonacci series of " + maxnumber + " is :");
		for (int i = 0; i < maxnumber; i++) {
			System.out.print(firstnumber + " ");
			int sum = firstnumber + secondnumber;
			firstnumber = secondnumber;
			secondnumber = sum;
		}

	}

	public static void main(String[] args) {
		FibonacciNumber fibonaccinumber = new FibonacciNumber();
		fibonaccinumber.displayFibonacciNum();
	}

}
