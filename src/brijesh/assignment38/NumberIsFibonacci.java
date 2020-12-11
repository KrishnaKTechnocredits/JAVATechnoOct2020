package brijesh.assignment38;

/*
Verify number is in Fibonacci series or not. 
*/

public class NumberIsFibonacci {

	void isNumberFibonacci(int number) {
		int n = 0, m = 1, sum = 0;
		if (number == n || number == m)
			System.out.println(number + " is fibonacci number");
		while (sum < number) {
			sum = n + m;
			n = m;
			m = sum;
		}
		if (number == sum)
			System.out.println(number + " is fibonacci number");
		else
			System.out.println(number + " is not fibonacci number");
	}

	public static void main(String[] args) {
		NumberIsFibonacci numberIsFibonacci = new NumberIsFibonacci();
		numberIsFibonacci.isNumberFibonacci(8);
		numberIsFibonacci.isNumberFibonacci(33);
	}
}
